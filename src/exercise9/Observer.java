package exercise9;

public interface Observer<T> {
    void notifyAdd ( T elem );
    void notifyRemove( T elem );
}
