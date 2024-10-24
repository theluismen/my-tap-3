package exercise5;

public class UpperCaseDecorator extends Message {
    private Message message;

    public UpperCaseDecorator ( Message message ) {
        super( message.getText() );
        this.message = message;
    }

    /* Métodos */
    public String getText() {
        return this.message.getText().toUpperCase();
    }
}
