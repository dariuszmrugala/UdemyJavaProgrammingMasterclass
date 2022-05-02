package section6.lect92;

public class Wardrobe {
    private int doors;
    private boolean isFull;
    private boolean isOpen;

    public Wardrobe(int doors, boolean isFull, boolean isOpen) {
        this.doors = doors;
        this.isFull = isFull;
        this.isOpen = isOpen;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isFull() {
        return isFull;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void open() {
        System.out.println("open the wardrobe");
        this.isOpen = true;
    }

    public void close() {
        System.out.println("close the wardrobe");
        this.isOpen = false;
    }

    @Override
    public String toString() {
        return "Wardrobe{" +
                "doors=" + doors +
                ", isFull=" + isFull +
                ", isOpen=" + isOpen +
                '}';
    }
}
