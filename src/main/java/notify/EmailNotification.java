package notify;

public class EmailNotification extends Notification {
        private String email;

        public EmailNotification (String email, String message) {
            super(message, Priority.HIGH);
            this.email = email;
        }
        public String getemail(){
            return email;
        }
        public void setEmail (String email){
            this.email = email;
        }

        @Override
    void send (String email) {
            this.email = email;
            System.out.println("Sending e-mail to"+ email);
            super.send();
        }

}
