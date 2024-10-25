package exercise7;

import java.util.Iterator;

public class NameRepository implements Iterable<Object> {

    public String[] names = {"Robert" , "John" ,"Julie" , "Lora"};

    public Iterator<Object> iterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator<Object> {

        int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            return names[index++];
        }
    }
}