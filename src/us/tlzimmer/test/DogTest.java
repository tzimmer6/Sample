package us.tlzimmer.test;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import us.tlzimmer.Dog;

import static org.junit.Assert.*;

public class DogTest extends TestCase {
    Dog aDog1;
    Dog aDog2;

    public DogTest() {};


    @Before
    public void setUp() throws Exception {
        //
        aDog1 = new Dog(true, "Fido");
        aDog2 = new Dog(false, "Spot");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testIsFriendly() {
        assertTrue("The dog is friendly.", aDog1.isFriendly());
        assertFalse("The dog is friendly.", aDog2.isFriendly());
    }

    @Test
    public void testTalk() {
        assertEquals("Bark", aDog1.talk());
    }

    @Test
    public void testToString() {
        assertEquals("Dog: " + "name=" + aDog2.getName() + " friendly=" + aDog2.isFriendly(), aDog2.toString());
    }

}