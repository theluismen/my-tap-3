package exercise9;

import java.util.Iterator;

public class Main {
    /* 9. ObserverList

    The problem is to create an ObserverList collection that implements the observer design pattern.
    It will notify of  changes to the observers (notifyAdd and notifyRemove methods)
    when the state of ObserverList is modified (add or remove elements).
    The collection must be Iterable and generic.

    Steps:

      1. Define observer contract
      2. Implement PrinterObserver to show by standard output the element and the completed operation (add or remove).
      3. Implement BackupObserver  to keep a copy of each added element and this function and remove then when was indicated.
      4. Make ObservgerList Iterable
      5. Implement ObserverList collection using parameteric polymorphism.
      6. Throw AlreadyExistsObserverException exception
      7. Create main class demonstrating all exercises */
    public static void main(String[] args) {
        // Observer List
        ObserverList<Integer>       list    = new ObserverList<>();

        // Observers
        PrinterObserver<Integer>    printer = new PrinterObserver<>();
        BackupObserver<Integer>     backup  = new BackupObserver<>();

        // Add Observers
        list.attachObserver( printer );
        list.attachObserver( backup );
        try {
            list.attachObserver( backup );
        } catch ( AlreadyExistsObserverException ex ) {
            System.out.println("Excepcion catched.");
        }

        for ( int i = 0; i < 6 ; i++ )
            list.add( i + 10 );

        list.remove( 10 );
        list.remove( 12 );

        /* TEST: Iterator method */
        for ( Iterator<Integer> it = list.iterator(); it.hasNext(); ) {
            System.out.println( it.next());
        }
    }
}
