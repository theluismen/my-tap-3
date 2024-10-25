package exercise7;

import java.util.Iterator;

public class NameRepository implements Iterable<String> {

    public String[] names = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator<String> iterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator<String> {

        int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public String next() {
            return names[index++];
        }
    }
}