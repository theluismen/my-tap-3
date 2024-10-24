package exercise5;

public class Message {
    private String text;

    /* Constructor Vacio */
    public Message () {}

    /* Constructor Normal */
    public Message ( String text ) {
        this.text = text;
    }

    /* Métodos */
    public String getText() {
        return this.text;
    }

    public void setText ( String text ) {
        this.text = text;
    }
}
