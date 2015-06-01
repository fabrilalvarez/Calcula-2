package calcula2;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PruebaTest {

    private Modelo mo;
    private float result1;
    private Calcula2 primeNumberChecker;

    @Before
    public void initialize() {
        primeNumberChecker = new Calcula2();
    }

    // Each parameter should be placed as an argument here
    // Every time runner triggers, it will pass the arguments
    // from parameters we defined in primeNumbers() method
    public PruebaTest(Modelo model, float result) {
        this.mo = model;
        this.result1 = result;
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][]{
            {new Modelo(1, 1, "+"), 2},
            {new Modelo(1, 2, "+"), 3},
            {new Modelo(3, 1, "-"), 2},
            {new Modelo(2, 1, "-"), 1},
            {new Modelo(2, 1, "/"), 2},
            {new Modelo(2, 1, "*"), 2}
        });
    }

    // This test will run 4 times since we have 5 parameters defined
    @Test
    public void testPrimeNumberChecker() {
        System.out.println("Parameterized is : " + result1);
        assertEquals(result1, primeNumberChecker.realizaOP(mo),0);
    }
}
