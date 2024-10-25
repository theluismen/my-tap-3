package exercise4;

public class Main {
    /* 3. Modify the observer sample to count the number of invocations of observers.
        Use the Counter Singleton inside each Observer implementation (BinaryObserver, ...).
        Show the final result of the Counter in the main program. */
    public static void main(String[] args) {

        Subject subject = new Subject();

        subject.attach( new BinaryObserver() );
        subject.attach( new OctalObserver() );
        subject.attach( new HexaObserver() );
        subject.attach( value -> {
            if ( value % 2 != 0 ) {
                System.out.println( "Odd Observer: " + value );
            }
        });

        subject.setState(3);        // 3 invocations
        subject.setState(10);       // + 3 invocations = 6
        subject.setState(11);       // + 3 invocations = 9

        CounterSingleton singleton = CounterSingleton.getSingleton();

        System.out.println( "Invocations of observers: " + singleton.get() );
    }
}
