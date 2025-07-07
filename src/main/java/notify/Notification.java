package notify;

public class Notification {
    private final int id; //неизменяемый (final) идентификатор id;
    private String message; //текст сообщения message;
    private Priority priority; // уровень важности priority;
    private static int nextId = 1; //  статический (static) счётчик / генератор nextId.

    public Notification() {
        this("empty", Priority.NORMAL);
    }

    // 2. С аргументами message + priority.
    public Notification(String message, Priority priority) { // Параметры String / Priotity с именами
        this.message = message;   // передаем параметр message
        this.priority = priority; // передаем параметр priority
        this.id = nextId++;
    }

    public void send() {
        System.out.println(this);
    }

    public void send(String extra) {
        System.out.println(this.message + " extra" + extra);
    }

    @Override
    public String toString() {
        return "Norification: " + message + "Priority: " + priority;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public Priority getPriority() {
        return priority;
    }
}