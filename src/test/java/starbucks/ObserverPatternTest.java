


package starbucks ;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ObserverPatternTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ObserverPatternTest
{

    PinEntryMachine pinEntryMachine;
    KeyPad keyPad;
    /**
     * Default constructor for test class ObserverPatternTest
     */
    public ObserverPatternTest()
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
        keyPad=new KeyPad();
        pinEntryMachine=new PinEntryMachine();
        keyPad.attach(pinEntryMachine);
        // Set up Key Pad and Pin Entry Machine
        // Using Observer Pattern  
    }


    @Test
    public void testOneKey()
    {
        // Key Pad Press 1
        keyPad.touch(1,5);

        // Assert D1 is "1" (replace with appropriate test)
        System.out.println((pinEntryMachine.d1()));
        assertTrue( pinEntryMachine.d1().equals("1") ) ;
    }

    @Test
    public void testTwoKeys()
    {
        // Key Pad Press 1 and 2
        keyPad.touch(1,5);
        keyPad.touch(2,5);

        // Assert D1 and D2 are correct 
        // (replace with appropriate test)
        assertTrue( pinEntryMachine.d1().equals("1") && pinEntryMachine.d2().equals("2") ) ;
    }

    @Test
    public void testThreeKeys()
    {
        // Key Pad Press 1, 2 and 3

        keyPad.touch(1,5);
        keyPad.touch(2,5);
        keyPad.touch(3,5);
        assertTrue( pinEntryMachine.d1().equals("1") && pinEntryMachine.d2().equals("2") && pinEntryMachine.d3().equals("3") ) ;
        // Assert D1, D2 and D3 are correct
        // (replace with appropriate test)
     }

    @Test
    public void testFourKeys()
    {
        keyPad.touch(1,5);
        keyPad.touch(2,5);
        keyPad.touch(3,5);
        keyPad.touch(4,5);
        assertTrue( pinEntryMachine.d1().equals("1") && pinEntryMachine.d2().equals("2") && pinEntryMachine.d3().equals("3") && pinEntryMachine.d4().equals("4")) ;
        // Key Pad Press 1, 2, 3 and 4

        // Assert D1, D2, D3 and D4 are correct
        // (replace with appropriate test)
    }

   @Test
    public void testBackspace()
    {

        keyPad.touch(1,5);
        keyPad.touch(2,5);
        keyPad.touch(3,5);
        keyPad.touch(4,5);
        keyPad.touch(3,8);
        assertTrue( pinEntryMachine.d1().equals("1") && pinEntryMachine.d2().equals("2") && pinEntryMachine.d3().equals("3")) ;


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
