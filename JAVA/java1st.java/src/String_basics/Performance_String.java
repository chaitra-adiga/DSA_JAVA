package String_basics;

public class Performance_String {
    public static void main(String[] args) {
        String series="";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i); // since i is a integer convert it into char
            //System.out.print(ch+" ");
            series += ch + " ";

        }
        System.out.println(series);
    }
}
//very bad time complexity each time new object is created and previous object are de referenced.