package section6.lect97;

public class Hamburger {
    private String name;
    private String rollType;
    private String meat;

    private int lettuce;
    private int tomato;
    private int carrot;
    private int onion;

    private double BasePrice;

    public Hamburger(String name, String rollType, String meat, int lettuce, int tomato, int carrot, int onion, double basePrice) {
        this.name = name;
        this.rollType = rollType;
        this.meat = meat;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.carrot = carrot;
        this.onion = onion;
        BasePrice = basePrice;
    }

    public Hamburger(String name, String rollType, String meat, double BasePrice) {
//        this.name = name;
//        this.rollType = rollType;
//        this.meat = meat;
//        this.BasePrice = BasePrice;
//
//        this.lettuce = 0;
//        this.tomato = 0;
//        this.carrot = 0;
//        this.onion = 0;
        this(name,rollType, meat, 0,0,0,0,BasePrice);
    }

    public void getAdditions(int lettuce, int tomato, int carrot, int onion) {
        if(lettuce + tomato + carrot + onion > 4) {
            System.out.println("too much additons. you may have only up to 4 additions.");
            return;
        }
        setCarrot(carrot);
        setLettuce(lettuce);
        setOnion(onion);
        setTomato(tomato);
    }

    public void setLettuce(int lettuce) {
        this.lettuce = lettuce;
    }

    public void setTomato(int tomato) {
        this.tomato = tomato;
    }

    public void setCarrot(int carrot) {
        this.carrot = carrot;
    }

    public void setOnion(int onion) {
        this.onion = onion;
    }

    public double getPrice() {
        return BasePrice + getAdditionsPrize();
    }

    public double getAdditionsPrize() {
        return lettuce * 0.2 + tomato * 0.3 + carrot * 0.8 + onion * 0.2;
    }

    public double getBasePrice() {
        return BasePrice;
    }

    public String getName() {
        return name;
    }
}
