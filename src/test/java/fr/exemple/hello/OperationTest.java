package fr.exemple.hello;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class OperationTest extends TestCase {
	public OperationTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( OperationTest.class );
    }

    /**
     *@test
     */
    public void testOperationAdd()
    {
        Operation op = new Operation();
        int result = op.add(5, 5);
        assertEquals("10", result);
    }
    
    /**
     *@test
     */
    public void testOperationSub()
    {
        Operation op = new Operation();
        int result = op.add(8, 5);
        assertEquals("3", result);
    }
}
