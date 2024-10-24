package exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Directory implements Component {
    /* Atributos */
    private String  name;
    private int     elems;
    List<Component> list;

    /* Constructor */
    public Directory ( String name ) {
        this.name = name;
        this.list = new ArrayList<>();
    }

    public Directory ( String name, List<Component> list ) {
        this.name = name;
        this.list = list;
    }

    /* Métodos */
    public void add ( Component component ) {
        this.list.add( component );
    }

    public String getName() {
        return this.name;
    }
    public int getSize() {
        return -1;
    }

    /* Métodos de Interface Component */
    /* It will print the name of all files and directories that it contains
     */
    public void ls() {
        for ( Component component: this.list ) {
            System.out.println( component.getName() );
        }
    }

    /**/
    public List<String> collect() {
        List<String> result = new ArrayList<>(), aux;
        result.add( this.name );                    // Add Dir Name
        for ( Component component: this.list ) {    // Add Children
            aux = component.collect();
            for ( String compAux: aux ) {
                result.add(compAux);
            }
        }
        return result;
    }


    public List<Component> toList() {
        List<Component> result = new ArrayList<>(), aux;
        result.add( this.clone() );                    // Add Dir Name
        for ( Component component: this.list ) {    // Add Children
            aux = component.toList();
            for ( Component compAux: aux ) {
                result.add(compAux);
            }
        }
        return result;
    }

    public List<Component> search( String name ) {
        List<Component> result = new ArrayList<>(), aux;
        for ( Component component: this.list ) {
            aux = component.search( name );
            for ( Component compAux: aux ) {
                result.add(compAux);
            }
        }
        return result;
    }

    public List<Component> search( Predicate<Component> predicate ) {
        List<Component> result = new ArrayList<>(), aux;
        if ( predicate.test( this ) ) {
            result.add( this.clone() );
        }
        for ( Component component: this.list ) {
            aux = component.search( predicate );
            for ( Component compAux: aux ) {
                result.add(compAux);
            }
        }
        return result;
    }

    public String toString ( String parentPath ) {
        String fullPath = parentPath + "/" + name;
        for ( Component component : this.list ) {
            fullPath += "\n" + component.toString(fullPath);
        }
        return fullPath;
    }

    /* Métodos auxiliares */

    public Directory clone () {
        return new Directory( this.name, this.list );
    }
}
