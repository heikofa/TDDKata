import org.junit.Test;

import org.junit.Assert.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by Heiko on 23.04.2016.
 */
public class CalculatorTest {
    @Test
    public void testEinsPlusEins() throws Exception {
        assertEquals(2,Calculator.add(1,1),0.001);
    }

    @Test
    public void testZweiPlusZwei() throws Exception {
        assertEquals(4,Calculator.add(2,2),0.001);
    }

    @Test
    public void testEinsMinusEins() throws Exception {
        assertEquals(0,Calculator.sub(1,1),0.001);
    }

    @Test
    public void testZweiMinusEins() throws Exception {
        assertEquals(1,Calculator.sub(2,1),0.001);
    }

    @Test
    public void testEinsMalEins() throws Exception {
        assertEquals(1, Calculator.mul(1,1),0.001);
    }

    @Test
    public void testZweiMalEins() throws Exception {
        assertEquals(2, Calculator.mul(2,1),0.001);
    }

    @Test
    public void testZweiMalZwei() throws Exception {
        assertEquals(4, Calculator.mul(2,2),0.001);
    }

    @Test
    public void testEinsDurchEins() throws Exception {
        assertEquals(1, Calculator.div(1,1),0.001);
    }

    @Test
    public void testZweiDurchEins() throws Exception {
        assertEquals(2, Calculator.div(2,1),0.001);
    }

    @Test
    public void testZweiDurchZwei() throws Exception {
        assertEquals(1, Calculator.div(2,2),0.001);
    }

    @Test
    public void testvierDurchZwei() throws Exception {
        assertEquals(2, Calculator.div(4,2),0.001);

    }
}
