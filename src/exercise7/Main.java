package exercise7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    /* Modify the existing Iterator sample to use java.util.Iterable<T> and java.util.Iterator<T> */
    public static void main(String[] args) {

        NameRepository names = new NameRepository();
        Iterator<Object> it = names.iterator();
        List<String> fanix = new ArrayList<>();

        while ( it.hasNext() ) {
            System.out.println( it.next() );
        }
    }
}
