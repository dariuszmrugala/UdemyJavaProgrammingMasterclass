package section6.lect88;

public class Car extends Vehicle{
    private int handSteering;
    private int gears;

    public Car(int speed, int handSteering, int gears) {
        super(speed);
        this.handSteering = handSteering;
        this.gears = gears;
    }

    public int getHandSteering() {
        return handSteering;
    }

    public void setHandSteering(int handSteering) {
        this.handSteering = handSteering;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    @Override
    public String toString() {
        return "Car{" +
                "handSteering=" + handSteering +
                ", gears=" + gears +
                ", speed=" + this.getSpeed() +
                '}';
    }

}
