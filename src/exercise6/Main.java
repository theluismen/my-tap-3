package exercise6;

public class Main {
    public static void main(String[] args) {
        Directory root  = new Directory("root");
        Directory games = new Directory("games");

        root.add( new File("README.md"));
        root.add( new File("text.txt"));
        root.add( new File("text1.txt"));

        games.add( new File("fortnite.exe", 1000));
        games.add( new File("minecraft.exe", 1000));
        games.add( new File("text1.txt"));

        root.add( games );

        /* TEST: .ls() */
        System.out.println("Testing .ls():");
        root.ls();
        System.out.println();

        /* TEST: .collect() */
        System.out.println("Testing .collect():");
        for ( String component: root.collect() ) {
            System.out.println( component );
        }
        System.out.println();

        /* TEST: .toList() */
        System.out.println("Testing .toList():");
        for ( Component component: root.toList() ) {
            System.out.println( component.getName() );
        }
        System.out.println();

        /* TEST: .search( name ) */
        System.out.println("Testing .search( name ):");
        for ( Component component: root.search( "text1.txt" ) ) {
            System.out.println( component.getName() );
        }
        System.out.println();

        /* TEST: .search( predicate ) */
        System.out.println("Testing 1 .search( predicate ):");
        for ( Component component: root.search( comp -> comp.getName().equals("text1.txt") ) ) {
            System.out.println( component.getName() );
        }
        System.out.println();

        /* TEST: .search( predicate ) */
        System.out.println("Testing 2 .search( predicate ):");
        for ( Component component: root.search( comp -> comp.getSize() > 200 ) ) {
            System.out.println( component.getName() );
        }
        System.out.println();

        /* TEST: .toString( predicate ) */
        System.out.println("Testing .toString():");
        System.out.println( root.toString() );
    }
}
