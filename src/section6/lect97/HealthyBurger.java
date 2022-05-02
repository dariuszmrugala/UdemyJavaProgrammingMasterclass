package section6.lect97;

public class HealthyBurger extends Hamburger{
    private int cabbage;
    private int leek;

    public HealthyBurger(String name, String rollType, String meat, double price) {
        super(name, rollType, meat, price);
        this.cabbage = 0;
        this.leek = 0;
    }

    public void getAdditions(int lettuce, int tomato, int carrot, int onion, int cabbage, int leek) {
        if(lettuce + tomato + carrot + onion + cabbage + leek > 6) {
            System.out.println("you allowed only up to 6 additions");
            return;
        }
//        super.getAdditions(lettuce, tomato, carrot, onion);
        super.setLettuce(lettuce);
        super.setTomato(tomato);
        super.setCarrot(carrot);
        super.setOnion(onion);
        this.cabbage = cabbage;
        this.leek = leek;
    }

    @Override
    public double getPrice() {
        return getBasePrice() + this.getAdditionsPrize();
    }

    public double getAdditionsPrize() {
        return super.getAdditionsPrize() + cabbage * 0.1 + leek * 0.1;
    }
}
