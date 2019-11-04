package fr.exemple.hello;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Salut le monde" );
        
        Operation op = new Operation();
        int res = op.add(5, 3);
        System.out.println( res );

        
        new App2();
    }
}
