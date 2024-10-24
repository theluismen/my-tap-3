package exercise6;

import java.util.List;
import java.util.function.Predicate;

public interface Component {
    public String getName();
    public int getSize();
    public void ls();
    public List<String> collect();
    public List<Component> toList();
    public List<Component> search( String name );
    public List<Component> search( Predicate<Component> predicate );
    public String toString( String parentPath );
}
