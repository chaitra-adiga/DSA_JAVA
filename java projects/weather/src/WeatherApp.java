import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//retrieve weather data from API - this is backend logic will fetch latest weather
//data from the external API and return it.
//the GUI will display this data to the user


public class WeatherApp {
    //fetch weather data for given location
    public static JSONObject getWeatherData(String locationName){
        //get location co-ordinates using geolocation API
        JSONArray locationData = getLocationData(locationName);

        //extract latitude and longitude data
        JSONObject location = (JSONObject) locationData.get(0);
        double latitude = (double)location.get("latitude");
        double longitude= (double)location.get("longitude");

        //build API request with location co-ordinates
        String urlString = "https://api.open-meteo.com/v1/forecast?" +
                "latitude=" + latitude + "&longitude=" + longitude +
                "&hourly=temperature_2m,relativehumidity_2m,weathercode,windspeed_10m&timezone=America%2FLos_Angeles";

        try{
            //call api and get response
            HttpURLConnection conn = fetchApiResponse(urlString);

            //check for response status
            //200 - means that the connection was a success
            //assert conn != null;
            if(conn.getResponseCode() != 200){
                System.out.println("Error : - Couldn't connect to API");
                return null;
            }

            //store result in json data
            StringBuilder resultJson = new StringBuilder();
            Scanner scanner = new Scanner(conn.getInputStream());
            while(scanner.hasNext()){
                resultJson.append(scanner.nextLine());

            }
            //close scanner
            scanner.close();

            //close connection
            conn.disconnect();

            //parse through our data , make it json object
            JSONParser parser= new JSONParser();
            JSONObject resultJsonObj = (JSONObject) parser.parse(String.valueOf(resultJson));

            //retrieve hourly data
            JSONObject hourly =(JSONObject) resultJsonObj.get("hourly");

            //we want to get the current hour's data
            //so we need to ge the index of our current hour
            JSONArray time = (JSONArray) hourly.get("time");
            int index = findIndexofCurrentTime(time);

            //get temperature
            JSONArray temperatureData = (JSONArray) hourly.get("temperature_2m");
            double temperature =(double) temperatureData.get(index);

            //get weather code
            //JSONArray weathercode = hourly.containsKey("weathercode") ? (JSONArray) hourly.get("weathercode") : null;

            // get weather code
            JSONArray weathercode = (JSONArray) hourly.get("weathercode");
            String weatherCondition = convertWeatherCode((long) weathercode.get(index));

            //get humidity
            JSONArray relativeHumidity = (JSONArray) hourly.get("relativehumidity_2m");
            long humidity = (long) relativeHumidity.get(index);

            //get windspeed
            JSONArray windspeedData = (JSONArray) hourly.get("windspeed_10m");
            double windspeed = (double) windspeedData.get(index);

            //build and return the weather json data object that we are going to access in our frontend
            JSONObject weatherData = new JSONObject();
            weatherData.put("temperature",temperature);
            weatherData.put("weather_condition",weatherCondition);
            weatherData.put("humidity",humidity);
            weatherData.put("windspeed",windspeed);


            return weatherData;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    //retrieves geographic coordinates using geolocation API
    private static JSONArray getLocationData(String locationName) {
        //replace white space with + to adhere to API's request format
        locationName= locationName.replace(" ","+");

        //builld API url with location parameter
        String urlString ="https://geocoding-api.open-meteo.com/v1/search?name="+locationName+"&count=10&language=en&format=json";
        try{
            //call api and get response
            HttpURLConnection conn = fetchApiResponse(urlString);

            //check response status - 200 means successful connection
            if(conn.getResponseCode() != 200 ){
                System.out.println("Error couldn't connect to API ");
                return null;
            }
            else{
                //store api result
                StringBuilder resultJson = new StringBuilder();
                Scanner scanner = new Scanner(conn.getInputStream());

                //read & store the resulting json data into our String Builder
                while (scanner.hasNext()){
                    resultJson.append(scanner.nextLine());
                }

                //close scanner
                scanner.close();

                //close url connection
                conn.disconnect();

                //parse the JSON String into JSON Object
                JSONParser parser = new JSONParser();
                JSONObject resultJsonObject = (JSONObject) parser.parse(String.valueOf(resultJson));

                //get the list of location data the API generated from the location name
                JSONArray locationData =(JSONArray) resultJsonObject.get("results");
                return locationData;

            }


        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    private static HttpURLConnection fetchApiResponse(String urlString) {
        try{
            //attempt to create connection
            URL url = new URL(urlString);
            HttpURLConnection conn =(HttpURLConnection) url.openConnection();

            //set request method to get
            conn.setRequestMethod("GET");

            //connect to our API
            conn.connect();
            return conn;
        }catch (IOException e){
            e.printStackTrace();
        }
        return  null; // if connection not made
    }

    private static int findIndexofCurrentTime(JSONArray timeList) {
        String currentTime = getCurrentTime();

        //iterate through the time list and see which one matches our current time
        for (int i = 0; i < timeList.size(); i++) {
            String time = (String) timeList.get(i);
            if(time.equalsIgnoreCase(currentTime)){
                //return index
                return i;
            }

        }
        return 0;
    }

    public static String getCurrentTime() {
        //get current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();

        //format date to be 2024-04-17T00:00 (this is how our api reads)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH':00'");

        //format and print the current date and time
        String formattedDateTime = currentDateTime.format(formatter);

        return formattedDateTime;

    }

    //converting the weather code into something more readable
    private static String convertWeatherCode(long weathercode){
        String weatherCondition = "";
        if(weathercode == 0L){
            // clear
            weatherCondition = "Clear";
        }else if(weathercode > 0L && weathercode <= 3L){
            // cloudy
            weatherCondition = "Cloudy";
        }else if((weathercode >= 51L && weathercode <= 67L)
                || (weathercode >= 80L && weathercode <= 99L)){
            // rain
            weatherCondition = "Rain";
        }else if(weathercode >= 71L && weathercode <= 77L){
            // snow
            weatherCondition = "Snow";
        }

        return weatherCondition;
    }
}
