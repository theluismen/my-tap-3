package exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class File implements Component {
    /* Atributos */
    private String  name;
    private int     size;

    /* Constructor */
    public File ( String name ) {
        this.name = name;
        this.size = 0;
    }

    /* Constructor */
    public File ( String name, int size ) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return this.name;
    }

    public int getSize() {
        return this.size;
    }

    /* Métodos de Interface Component */
    public void ls () {
        System.out.println(this.name);
    }

    public List<String> collect() {
        List<String> aux = new ArrayList<>();
        aux.add( this.name );
        return aux;
    }

    public List<Component> toList() {
        List<Component> aux = new ArrayList<>();
        aux.add( this.clone() );
        return aux;
    }

    public List<Component> search( String name ) {
        List<Component> result = new ArrayList<>();
        if ( this.name.equals(name) ) {
            result.add( this.clone() );
        }
        return result;
    }

    public List<Component> search( Predicate<Component> predicate ) {
        List<Component> result = new ArrayList<>();
        if ( predicate.test(this) ) {
            result.add( this.clone() );
        }
        return result;
    }

    /* Métodos auxiliares */
    public String toString( String parentPath ) {
        return parentPath + "/" + name; // Full path representation
    }

    public File clone () {
        return new File( this.name, this.size );
    }
}
