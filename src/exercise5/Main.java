package exercise5;

/* 5. Create a Message class with one single text property.
Create a UpperCaseDecorator of Message that converts the message to uppercase (getText).
Create an Insult Decorator that adds an insult to the text. */
public class Main {
    //Message msg = new Message("vtec just kicked in yo");
    //UpperCaseDecorator upper = new UpperCaseDecorator( msg );
    public static void main(String[] args) {
        Message msg     = new Message("vtec just kicked in yo");
        Message upper   = new UpperCaseDecorator( msg );
        Message insult  = new InsultDecorator( upper );
        Message filter  = new FilterDecorator( insult );

        System.out.println( msg.getText() );
        System.out.println( upper.getText() );
        System.out.println( insult.getText() );
        System.out.println( filter.getText() );
    }
}
