import org.json.simple.JSONObject;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class WeatherAppGui extends JFrame {
    private JSONObject weatherData; // this will hold our weather data
    public WeatherAppGui(){
        //constructor - setup ours gui and add title
        super("Weather App");

        //conf. our gui to end the programs process once it has been closed
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //set size of gui in pixels
        setSize(450,650);

        //load our gui at center of screen
        setLocationRelativeTo(null);
        // make our layout manager null to manually position our components within the gui
        setLayout(null);

        // prevent any resize of our gui
        setResizable(false);

        addGuiComponents();

    }

    private void addGuiComponents() {
        // search field
        JTextField searchTextField = new JTextField();

        //set location and size of our search component
        searchTextField.setBounds(15,15,351,45);

        //change the font style and size
        searchTextField.setFont(new Font("Dialog",Font.PLAIN,24));
        add(searchTextField);

        //weather image
        JLabel weatherConditionImage = new JLabel(loadImage("src/assets/cloudy.png"));
        weatherConditionImage.setBounds(0,125,450,217);
        add(weatherConditionImage);

        //temperature text
        JLabel temperatureText = new JLabel("10 °C");
        temperatureText.setBounds(0,350,450,54);
        temperatureText.setFont(new Font("Dialog",Font.BOLD,48));//even if this is not given it uses default piddii font

        //center the text
        temperatureText.setHorizontalAlignment(SwingConstants.HORIZONTAL);
        add(temperatureText);

        //weather condition description
        JLabel weatherConditionDesc = new JLabel("Cloudy");
        weatherConditionDesc.setBounds(0,405,450,54);
        weatherConditionDesc.setFont(new Font("Dialog",Font.PLAIN,32));
        weatherConditionDesc.setHorizontalAlignment(SwingConstants.HORIZONTAL);
        add(weatherConditionDesc);

        //humidity image
        JLabel humidityImage = new JLabel(loadImage("src/assets/humidity.png"));
        humidityImage.setBounds(15,500,74,66);
        add(humidityImage);

        //humidity text
        //JLabel humidityText = new JLabel(" Humidity 100% ");
        JLabel humidityText = new JLabel("<html><b>Humidity</b> 100%</html>");
        humidityText.setBounds(90,500,85,55);
        humidityText.setFont(new Font("Dialog",Font.PLAIN,16));
        add(humidityText);

        //wind speed image
        JLabel windspeedImage = new JLabel(loadImage("src/assets/windspeed.png"));
        windspeedImage.setBounds(220,500,74,66);
        add(windspeedImage);

        //windspeed Tect
        JLabel windspeedText = new JLabel("<html><b>Windspeed</b> 15km/h</html>");
        windspeedText.setBounds(310,500,85,55);
        windspeedText.setFont(new Font("Dialog",Font.PLAIN,16));
        add(windspeedText);

        //search button - magnifying glass icon
        JButton searchButton = new JButton(loadImage("src/assets/search.png"));

        //change the normal cursor into hand cursor when hovering over this button
        searchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        searchButton.setBounds(375, 13, 47, 45);
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // get location from user
                String userInput = searchTextField.getText();

                // validate input - remove whitespace to ensure non-empty text
                if(userInput.replaceAll("\\s", "").length() <= 0){
                    return;
                }

                //retrieve weather data
                weatherData=WeatherApp.getWeatherData(userInput);

                //update GUI
                //update weather image
                String weatherCondition = (String) weatherData.get("weather_condition");

                // depending on the condition, we will update the weather image that corresponds with the condition
                switch (weatherCondition){
                    case "Clear":
                        weatherConditionImage.setIcon(loadImage("src/assets/clear.png"));
                        break;
                    case "Cloudy":
                        weatherConditionImage.setIcon(loadImage("src/assets/cloudy.png"));
                        break;
                    case "Rain":
                        weatherConditionImage.setIcon(loadImage("src/assets/rain.png"));
                        break;
                    case "Snow":
                        weatherConditionImage.setIcon(loadImage("src/assets/snow.png"));
                        break;
                }

                //update temperature text
                double temperature = (double) weatherData.get("temperature");
                temperatureText.setText(temperature+" °C");

                //update weather conditions
                weatherConditionDesc.setText(weatherCondition);

                //update humidity text
                long humidity =(long) weatherData.get("humidity");
                humidityText.setText("<html><b>Humidity</b> "+ humidity+"%</html>");

                //update wind speed
                double windspeed =(double) weatherData.get("windspeed");
                windspeedText.setText("<html><b>Windspeed</b> "+ windspeed+"km/h</html>");
            }
        });
        add(searchButton);


    }

    //use to create images in our gui components
    private ImageIcon loadImage(String resourcePath){
        try{
            //read image file from the given path
            BufferedImage image = ImageIO.read(new File(resourcePath));

            //returns an image icon so that our component can render it
            return new ImageIcon(image);
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("could not find resource ");
        return null;
    }
}
