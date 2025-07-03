package notify;

public class SmsNotification extends Notification {
    private String phone;

    public SmsNotification(String phone, String text) {
        super(text, Priority.LOW);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public void send() {
        System.out.println("Sending e-mail to" + phone);
        super.send();
    }
}

