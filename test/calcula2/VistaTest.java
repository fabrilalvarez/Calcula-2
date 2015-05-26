package calcula2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author @FranJAbrilA <ffrannabril@gmail.com>
 */
public class VistaTest {

    public VistaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of realizaOP method, of class Vista.
     */
    @Test
    public void testRealizaOP() {
        System.out.println("realizaOP");
        Modelo cont = new Modelo(1,1,"+");
        Modelo cont2 = new Modelo(1,2,"+");
        Modelo cont3 = new Modelo(3,1,"-");
        Modelo cont4 = new Modelo(2,1,"-");
        Modelo cont5 = new Modelo(2,1,"/");
        Modelo cont6 = new Modelo(2,1,"*");
        float result = Vista.realizaOP(cont);
        assertEquals(2, result, 0);
        result = Vista.realizaOP(cont2);
        assertEquals(3, result, 0);
        result = Vista.realizaOP(cont3);
        assertEquals(2, result, 0);
        result = Vista.realizaOP(cont4);
        assertEquals(1, result, 0);
        result = Vista.realizaOP(cont5);
        assertEquals(2, result, 0);
        result = Vista.realizaOP(cont6);
        assertEquals(2, result, 0);

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
