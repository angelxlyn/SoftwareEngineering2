package ISP;

public class BasicPhone implements SmartPhone {
    @Override
    public void makeCall(String number) {
        System.out.println("BasicPhone calling " + number);
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("BasicPhone sending SMS to " + number + ": " + message);
    }
}
