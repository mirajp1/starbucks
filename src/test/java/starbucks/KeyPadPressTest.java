


package starbucks ;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class KeyPadPressTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class KeyPadPressTest
{
    KeyPad kp ;

    /**
     * Default constructor for test class KeyPadPressTest
     */
    public KeyPadPressTest()
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
        kp = new KeyPad() ;
    }


    @Test
    public void testOne()
    {
        // Press 1
        // Assertion (Replace with appropriate test)
        kp.touch(1, 5);
        assertTrue(kp.lastKey.equals("1"));
    }

    @Test
    public void testTwo()
    {
        // Press 2

        // Assertion (Replace with appropriate test)
        kp.touch(2, 5);
        assertTrue(kp.lastKey.equals("2"));
    }

    @Test
    public void testThree()
    {
        // Press 3

        // Assertion (Replace with appropriate test)
        kp.touch(3, 5);
        assertTrue(kp.lastKey.equals("3"));
    }

    @Test
    public void testFour()
    {
        // Press 4

        // Assertion (Replace with appropriate test)
        kp.touch(1, 6);
        assertTrue(kp.lastKey.equals("4"));
    }

    @Test
    public void testFive()
    {
        // Press 5

        // Assertion (Replace with appropriate test)
        kp.touch(2, 6);
        assertTrue(kp.lastKey.equals("5"));
    }

    @Test
    public void testSix()
    {
        // Press 6

        // Assertion (Replace with appropriate test)
        kp.touch(3, 6);
        assertTrue(kp.lastKey.equals("6"));
    }

    @Test
    public void testSeven()
    {
        // Press 7

        // Assertion (Replace with appropriate test)
        kp.touch(1, 7);
        assertTrue(kp.lastKey.equals("7"));
    }

    @Test
    public void testEight()
    {
        // Press 8

        // Assertion (Replace with appropriate test)
        kp.touch(2, 7);
        assertTrue(kp.lastKey.equals("8"));
    }

    @Test
    public void testNine()
    {
        // Press 9

        // Assertion (Replace with appropriate test)
        kp.touch(3, 7);
        assertTrue(kp.lastKey.equals("9"));
    }

    @Test
    public void testZero()
    {
        // Press 0

        // Assertion (Replace with appropriate test)
        kp.touch(0, 5);
        assertTrue(kp.lastKey.equals("0"));
    }

    @Test
    public void testBackspace()
    {
        // Press Backspace

        // Assertion (Replace with appropriate test)
        kp.touch(3, 8);
        assertTrue(kp.lastKey.equals("X"));
    }

    @Test
    public void testNoKey()
    {
        // Press Empty Key

        // Assertion (Replace with appropriate test)
        kp.touch(1, 8);
        assertTrue(kp.lastKey.equals(" "));
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