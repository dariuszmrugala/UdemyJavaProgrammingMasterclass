package section6.lect88;

public class Main {
    public static void main(String[] args) {
        SpecificCar specificCar = new SpecificCar(20, 0, 0, 0);
        System.out.println(specificCar);

        specificCar.setSpeed(specificCar.getSpeed() + 20);
        System.out.println(specificCar);

    }
}
