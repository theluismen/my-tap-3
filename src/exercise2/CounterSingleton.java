package exercise2;

public class CounterSingleton {
    /* Atributos */
    private static CounterSingleton singleton;
    private static int counter;

    /* Constructor */
    private CounterSingleton () {
        CounterSingleton.counter = 0;
    }

    /* Métodos */
    public static CounterSingleton getSingleton () {
        if ( CounterSingleton.singleton == null ) {
            CounterSingleton.singleton = new CounterSingleton();
        }
        return CounterSingleton.singleton;
    }

    public void increment() {
        CounterSingleton.counter ++;
    }

    public int get() {
        return CounterSingleton.counter;
    }
}
