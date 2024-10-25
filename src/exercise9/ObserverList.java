package exercise9;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ObserverList<T> implements Iterable<T> {
    /* Atributos */
    private List<T>             lista;
    private List< Observer<T> > observers;

    /* Constructor */
    public ObserverList () {
        this.lista     = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    /* Métodos */
    public void attachObserver ( Observer<T> o ) {
        if ( this.observers.contains( o ) )
            throw new AlreadyExistsObserverException("EXCEPTION: Already Exists The Observer:" + o );
        this.observers.add( o );
    }

    public void add ( T elem ) {
        this.lista.add( elem );
        this.notifyAdd( elem );
    }

    public void remove ( T elem ) {
        if ( ! this.lista.isEmpty() ) {
            this.lista.remove( elem );
            this.notifyRemove( elem );
        }
    }

    /* Metodo de Observers<T> */
    public void notifyAdd( T elem ) {
        for ( Observer<T> observer : this.observers ) {
            observer.notifyAdd( elem );
        }
    }

    /* Metodo de Observers<T> */
    public void notifyRemove( T elem ) {
        for ( Observer<T> observer : this.observers ) {
            observer.notifyRemove( elem );
        }
    }

    /* Metodo de Iterable<T> */
    public Iterator<T> iterator () {
        return this.lista.iterator();
    }

}
