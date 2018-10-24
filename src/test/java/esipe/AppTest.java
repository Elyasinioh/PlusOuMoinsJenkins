package esipe;

import static org.junit.Assert.assertTrue;
import esipe.INbrAleatoire;
import esipe.GameEngine;

import org.junit.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{

    /*@Test
    //public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }*/
        /**
         * Create the test case
         *
         * @param testName name of the test case
         */
        public AppTest( String testName )
        {
            super( testName );
        }


        /**
         * Rigourous Test :-)
         */
        public void testApp()
        {
            INbrAleatoire game = new AleatoireNbStub();
            GameEngine party = new GameEngine(game);

            assertEquals( party.isGood(1),"C'est bon !!" );
            assertEquals( party.isGood(2),"C'est un peu moins" );
            assertEquals( party.isGood(0),"C'est un peu plus" );
            assertTrue( party.retry("o"));
            assertTrue(!party.retry("n"));

 }

}
