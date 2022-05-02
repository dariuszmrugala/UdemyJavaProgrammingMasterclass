package section6.lect96;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }
}

class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Ford");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Car porshe = new Car(12, "Porshe") {
          @Override
          public String startEngine() {
              return "Porshe -> startEngine()";
          }
          @Override
          public String accelerate() {
                return "Porshe -> accelerate()";
          }
          @Override
          public String brake() {
                return "Porshe -> brake()";
          }
        };
        System.out.println(porshe.startEngine());
        System.out.println(porshe.accelerate());
        System.out.println(porshe.brake());

        Holden holden = new Holden(6, "Ford");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

    }

    static class Ford extends Car {
        public Ford(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return "Ford -> startEngine()";
        }

        @Override
        public String accelerate() {
            return "Ford -> accelerate()";
        }

        @Override
        public String brake() {
            return "Ford -> brake()";
        }
    }

    static class Holden extends Car {
        public Holden(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return getClass().getSimpleName() + " -> startEngine()";
        }

        @Override
        public String accelerate() {
            return getClass().getName() + " -> accelerate()";
        }

        @Override
        public String brake() {
            return "Holden -> brake()";
        }
    }
}
