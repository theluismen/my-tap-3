package exercise5;

public class InsultDecorator extends Message {
    private Message message;

    public InsultDecorator ( Message message ) {
        super( message.getText() );
        this.message = message;
    }

    /* Métodos */
    public String getText() {
        return this.message.getText() + " tonto !!";
    }
}