package exercise9;

import java.util.ArrayList;
import java.util.List;

public class BackupObserver<T> implements Observer<T> {
    /* Atributos */
    private List<T> lista;

    public BackupObserver () {
        this.lista = new ArrayList<>();
    }

    @Override
    public void notifyAdd( T elem ) {
        this.lista.add( elem );
        System.out.println("Backed up: " + elem );
    }

    @Override
    public void notifyRemove( T elem ) {
        if ( ! this.lista.isEmpty() ) {
            this.lista.remove( elem );
            System.out.println("Removed from Backup: " + elem );
        }
    }
}

