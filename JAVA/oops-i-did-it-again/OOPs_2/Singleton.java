package OOPs_2;

public class Singleton {
    private Singleton(){

    }

    public static Singleton instance; //object
    public static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }

}
