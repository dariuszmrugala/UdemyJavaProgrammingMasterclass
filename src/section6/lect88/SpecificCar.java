package section6.lect88;

public class SpecificCar extends Car{
    private int spoilers;

    public SpecificCar(int speed, int handSteering, int gears, int spoilers) {
        super(speed, handSteering, gears);
        this.spoilers = spoilers;
    }

    public int getSpoilers() {
        return spoilers;
    }

    public void setSpoilers(int spoilers) {
        this.spoilers = spoilers;
    }

    @Override
    public String toString() {
        return "SpecificCar{" +
                "spoilers=" + spoilers +
                "gears=" + this.getGears() +
                "handSteering=" + this.getHandSteering() +
                "speed=" + this.getSpeed() +
                '}';
    }
}
