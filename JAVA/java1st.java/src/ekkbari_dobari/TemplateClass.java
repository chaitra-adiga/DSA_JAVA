package ekkbari_dobari;

//public class Templatclass {
//    public static void main(String[] args) {
//
//    }
//
//    public class Templateclass<T>{
//        public T value;
//        public templateclass
//
//    }
//}
public class TemplateClass<T> {

    private T value;

    public TemplateClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public  void main(String[] args) {
        System.out.println("Testing laah");
        getValue();
    }

}