package section6.lect97;

public class TestDrive {
    public static void main(String[] args) {
        Hamburger BaseHamburger = new Hamburger("Base Hamburger", "base roll", "red", 4.2);
        BaseHamburger.getAdditions(1,1,0,0);
        System.out.println("Base prize of " + BaseHamburger.getName() + " is " + BaseHamburger.getBasePrice());
        System.out.println("Additionals prize of " + BaseHamburger.getName() + " is " + BaseHamburger.getAdditionsPrize());
        System.out.println("Prize of base hamburger: " + BaseHamburger.getPrice());

        HealthyBurger healthyBurger = new HealthyBurger("healthy hamburger", "vrown rye bread roll", "red", 4.2);
        healthyBurger.getAdditions(1,1,2,0,1,1);
        System.out.println("Base prize of " + healthyBurger.getName() + " is " + healthyBurger.getBasePrice());
        System.out.println("Additionals prize of " + healthyBurger.getName() + " is " + healthyBurger.getAdditionsPrize());
        System.out.println(healthyBurger.getPrice());

    }
}
