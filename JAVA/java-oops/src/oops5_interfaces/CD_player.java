package oops5_interfaces;

public class CD_player implements Media_player{
    @Override
    public void start() {
        System.out.println("Music player started");
    }

    @Override
    public void stop() {
        System.out.println("Music player stopped");
    }
}
