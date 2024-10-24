package exercise2;

/* 2. Create a Counter Singleton that maintains a global counter with methods to increment and get the current value.
Show a simple example.*/
public class Main {
    public static void main(String[] args) {
        CounterSingleton counter, counter2;

        counter = CounterSingleton.getSingleton();

        for ( int i = 1; i <= 6; i++)
            counter.increment();

        System.out.println( "Global Counter = " + counter.get() );    // counter = 6

        counter2 = CounterSingleton.getSingleton();

        counter2.increment();

        System.out.println( "Global Counter = " + counter2.get() );   // counter2 = 7
    }
}
