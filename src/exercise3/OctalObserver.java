package exercise3;

/**
 * Created by pedro on 10/7/16.
 */
public class OctalObserver implements Observer{


    @Override
    public void update(int newState) {
        CounterSingleton singleton = CounterSingleton.getSingleton();
        singleton.increment();
        System.out.println( "Octal String: " + Integer.toOctalString(newState) );
    }
}
