package oops5_interfaces;

public class Car implements engine,Brake,Media_player{
    @Override
    public void brake() {
        System.out.println("I brake engine like a normal car");
    }

    @Override
    public void start() {
        System.out.println("I start engine like a normal car");

    }

    @Override
    public void start(String car) {
        System.out.println(car +" start engine like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop engine like a normal car");

    }

    @Override
    public void acc() {
        System.out.println("I accelerate engine like a normal car");

    }
}
