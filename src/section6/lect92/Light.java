package section6.lect92;

public class Light {
    private boolean isOn;

    public Light(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        System.out.println("light turn on");
        this.isOn = true;
    }

    public void turnOff() {
        System.out.println("light turn off");
        this.isOn = false;
    }

    @Override
    public String toString() {
        return "Light{" +
                "isOn=" + isOn +
                '}';
    }
}
