package section6.ex44;

public class MobilePhoneClient {
    public static void main(String[] args) {
        Contact darek1 = new Contact("darek", "1234");
        Contact darek2 = new Contact("darek", "2345");
        Contact marek1 = new Contact("marek", "4321");

        System.out.println(darek1.equals(darek2));
        System.out.println(marek1.equals(darek1));
    }
}
