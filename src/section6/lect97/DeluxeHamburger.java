package section6.lect97;

public class DeluxeHamburger extends Hamburger{

    private int chips;
    private int drinks;

    public DeluxeHamburger(String name, String rollType, String meat, double price, int chips, int drinks) {
        super(name, rollType, meat, price);
        this.chips = chips;
        this.drinks = drinks;
    }
}
