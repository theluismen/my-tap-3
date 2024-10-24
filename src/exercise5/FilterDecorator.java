package exercise5;

public class FilterDecorator extends Message {
    private Message message;

    public FilterDecorator ( Message message ) {
        super( message.getText() );
        this.message = message;
    }

    /* Métodos */
    public String getText() {
        return this.message.getText().replace("tonto", "xxx");
    }
}
