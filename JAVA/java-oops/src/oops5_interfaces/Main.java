package oops5_interfaces;

public class Main {
    public static void main(String[] args) {
        engine lalpari = new Car();
        lalpari.start("buccati");
        lalpari.stop();
        //lalpari.brake();--- doesnt exists in engine interface

        Media_player car_media = new Car();
        car_media.stop();


        MyCar ducati = new MyCar();
        //engine nayasa = new Electric_engine();


        //MyCar porshe = new MyCar(nayasa);
        MyCar porshe = new MyCar();
        porshe.start();
        porshe.stop();
        porshe.startMusic();
        porshe.stopMusic();
        porshe.upgradeEngine();
        porshe.start();

    }
}
