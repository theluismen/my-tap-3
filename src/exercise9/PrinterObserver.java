package exercise9;

public class PrinterObserver<T> implements Observer<T> {

    @Override
    public void notifyAdd( T elem ) {
        System.out.println( "ADD[ " + elem + " ]");
    }

    @Override
    public void notifyRemove( T elem ) {
        System.out.println( "REM[ " + elem + " ]");
    }
}
