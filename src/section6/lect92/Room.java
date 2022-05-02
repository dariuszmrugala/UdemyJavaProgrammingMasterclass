package section6.lect92;

public class Room {
    private Wardrobe wardrobeWithMirrors;
    private Wardrobe wardrobe2;
    private Light myLight;

    public Room(Wardrobe wardrobeWithMirrors, Wardrobe wardrobe2, Light myLight) {
        this.wardrobeWithMirrors = wardrobeWithMirrors;
        this.wardrobe2 = wardrobe2;
        this.myLight = myLight;
    }

//    public Wardrobe getWardrobeWithMirrors() {
//        return wardrobeWithMirrors;
//    }
//
//    public Wardrobe getWardrobe2() {
//        return wardrobe2;
//    }
//
//    public Light getMyLight() {
//        return myLight;
//    }

    public void openWardrobeWithMirrors() {
        this.wardrobeWithMirrors.open();
    }

    public void openWardrobe2() {
        this.wardrobe2.open();
    }

    public void switchLightOff() {
        this.myLight.turnOff();
    }

    public void switchLightOn() {
        this.myLight.turnOn();
    }




    @Override
    public String toString() {
        return "Room{" +
                "wardrobeWithMirrors=" + wardrobeWithMirrors +
                ", wardrobe2=" + wardrobe2 +
                ", myLight=" + myLight +
                '}';
    }
}
