package oops5_interfaces;

public class Electric_engine implements engine{
    @Override
    public void start(String car) {
        System.out.println("Electric engine start");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stop");

    }

    @Override
    public void acc() {
        System.out.println("Electric engine accelerated");
    }
}
