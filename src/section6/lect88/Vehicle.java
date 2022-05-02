package section6.lect88;

public class Vehicle {
    private int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                '}';
    }

}
