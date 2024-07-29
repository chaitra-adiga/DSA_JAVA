package oops5_interfaces;

public class MyCar {
    private engine eng;
    private Media_player player = new CD_player();

    public MyCar(){
        eng= new Power_engine();
    }

    public MyCar(engine eng){
        this.eng= eng;
    }

    public void start() {
        eng.start("Porshe");
    }

    public void stop() {
        eng.stop();
    }

    public void startMusic() {
        player.start();
    }

    public void stopMusic() {
        player.stop();
    }

    public void upgradeEngine() {
        this.eng = new Electric_engine();
        System.out.println("Engine upgraded !");
    }
}
