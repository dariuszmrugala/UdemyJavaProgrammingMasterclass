package section9.lect123;

public class Main {
    public static void main(String[] args) {
        ITelephone darekPhone;
        darekPhone = new DeskPhone(123456789);

        darekPhone.powerOn();

        ITelephone anotherPhone = new ITelephone() {
            @Override
            public void powerOn() {

            }

            @Override
            public void dial(int phoneNumber) {

            }

            @Override
            public void answer() {

            }

            @Override
            public boolean callPhone(int phoneNumber) {
                return false;
            }

            @Override
            public boolean isRinging() {
                return false;
            }
        };

        darekPhone = new MobliePhone(1234);
        darekPhone.powerOn();
        darekPhone.callPhone(1234);
        darekPhone.answer();
    }
}
