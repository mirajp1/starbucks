

package starbucks ;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class StrategyPatternTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StrategyPatternTest
{
    IApp app ;
    
    /**
     * Default constructor for test class StrategyPatternTest
     */
    public StrategyPatternTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        app = new AppAuthProxy() ;
    }


    @Test
    public void testLandscape()
    {
        app.touch(1,5) ;
        app.touch(2,5) ;
        app.touch(3,5) ;
        app.touch(1,6) ;

        app.landscape();
        // Login to App
        app.execute("B");
        // Put in Landscape Mode   

        // Validate App is in Landscape Mode 
        // (replace with correct assert)
        assertTrue( app.screen().equals("MyCards")) ;
    }

    @Test
    public void testPortrait()
    {
        app.touch(1,5) ;
        app.touch(2,5) ;
        app.touch(3,5) ;
        app.touch(1,6) ;

        app.portrait();
        // Login to App
        app.execute("B");
        // Put in Landscape Mode

        // Validate App is in Landscape Mode
        // (replace with correct assert)
        assertTrue( !app.screen().equals("MyCards")) ;
    }

    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
