package section6.lect87;

public class Dog {
    private static String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" + this.name + "}";
    }
}
