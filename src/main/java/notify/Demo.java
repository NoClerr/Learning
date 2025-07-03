package notify;

public class Demo {
    public static void main(String[] args) {
        Notification[] notif = new Notification[3];
        notif[0] = new Notification("Message", Priority.NORMAL);
        notif[1] = new EmailNotification("lalala@gg.com", "Mi amor");
        notif[2] = new SmsNotification("79991009988", "Mon amour");

        for (Notification notification : notif) {
            notification.send();
        }
        System.out.println("Общее количество уведомлений: " + notif.length);
    }
}
