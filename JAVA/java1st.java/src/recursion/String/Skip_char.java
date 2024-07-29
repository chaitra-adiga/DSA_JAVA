package recursion.String;

public class Skip_char {
    public static void main(String[] args) {
        String input="baccahaag";
        //skip("",input);
        System.out.println(skip(input));
    }
    static void skip(String p, String up){
        //base
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));
        }else {
            skip(p+ch,up.substring(1));
        }
    }

    static String skip(String up){
        //base
        if(up.isEmpty()){
            return ""; //return empty string + cant make any more calls
        }

        char ch= up.charAt(0);
        if(ch=='a'){
            return skip(up.substring(1));
        }else {
            return ch+skip(up.substring(1)); //that character plus answer from recursion call
        }
    }
}
