package section6.lect92;

public class Main {
    public static void main(String[] args) {
        Room myroom = new Room(
                new Wardrobe(2, false, false),
                new Wardrobe(2, false, false),
                new Light(true));

        System.out.println(myroom);

//        myroom.getWardrobeWithMirrors().open();
//        myroom.getWardrobe2().open();
//
//        System.out.println(myroom);
//
//        myroom.getMyLight().turnOff();

        myroom.openWardrobeWithMirrors();
        myroom.openWardrobe2();
        myroom.switchLightOff();

        System.out.println(myroom);
    }
}
