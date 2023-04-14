import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StringTests {

    private List<String> collectionStrings;

    @Before
    public void setUp(){
        this.collectionStrings = new ArrayList<>();
    }

    @Test //annotation needs to be attached to something, hence the method
    public void testIfStringSaysAzeban(){
        String stringIExpect = "Azeban";
        String stringIgot = "banana";
        String rightString = "Azeban";
        assertEquals(stringIExpect, rightString);
    }

    @Test
    public void numbers() {
        double price = 20.0;
        double discount = 5.0;
        assertEquals(15.0, price - discount, 1.0);// you can be up to 1.0 off and still be correct(delta)
    }

    @Test
    public void testObjectsDifferentOrSame(){
        Object dog = new Object();
        Object sheep = new Object();
        Object clonedSheep = sheep;

        assertNotSame(dog, sheep);
        assertSame(clonedSheep, sheep);
    }

    @Test
    public void testIfArrayElementsEqual(){
        char[] jUnitArray = {'J', 'u', 'n', 'i', 't'};
        char[] jUnitArray2 = {'J', 'u', 'n', 'i', 't'};

        assertArrayEquals(jUnitArray, jUnitArray2);
    }

    @Test
    public void testMathematics(){
        assertTrue((5+5) == 10);
    }

}


