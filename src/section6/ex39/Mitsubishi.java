package section6.ex39;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getName();
    }

    @Override
    public String accelerate() {
        return getClass().getName();
    }

    @Override
    public String brake() {
        return getClass().getName();
    }
}
