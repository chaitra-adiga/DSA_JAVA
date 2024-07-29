package oops5_interfaces;

public class Power_engine implements engine{
    @Override
    public void start(String car) {
        System.out.println("Power engine started");
    }

    @Override
    public void stop() {
        System.out.println("Power engine stopped");

    }

    @Override
    public void acc() {
        System.out.println("Power engine accelerated");

    }
}
