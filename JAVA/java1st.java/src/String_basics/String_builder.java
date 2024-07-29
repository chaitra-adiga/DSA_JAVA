package String_basics;

public class String_builder {
    public static void main(String[] args) {
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch =(char)('a'+i);
            build.append(ch+" ");
        }
        System.out.println(build);
    }
}
