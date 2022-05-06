package section6.ex40;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 19.10, "White");
        super.addHamburgerAddition1("Chips", 0);
        super.addHamburgerAddition2("Drink", 0);
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        super.addHamburgerAddition1(addition1Name, 0);
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        super.addHamburgerAddition2(addition2Name, 0);
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }
}
