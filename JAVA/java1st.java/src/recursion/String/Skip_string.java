package recursion.String;

public class Skip_string {
    public static void main(String[] args) {
        String ip= "I love an apple but not in the app store";
        System.out.println(skip_App_Notapple(ip));
    }
    static String skip_apple(String ip){
        if(ip.isEmpty()){
            return "";
        }

        if(ip.startsWith("apple")){
             return skip_apple(ip.substring(5));
        }else{
            return ip.charAt(0)+skip_apple(ip.substring(1));
        }
    }

    static String skip_App_Notapple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skip_App_Notapple(up.substring(3));
        }else {
            return up.charAt(0)+skip_App_Notapple(up.substring(1));
        }
    }
}
