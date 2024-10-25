package exercise7;

import java.util.Iterator;

public class Main {
    /* Modify the existing Iterator sample to use java.util.Iterable<T> and java.util.Iterator<T> */
    public static void main(String[] args) {

        NameRepository names = new NameRepository();
        Iterator<String> it = names.iterator();

        while ( it.hasNext() ) {
            System.out.println( it.next() );
        }
    }
}
