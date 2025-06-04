import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorTest {

    @Test
    void testPrimeFactorOf1() {
        PrimeFactor primeFactor = new PrimeFactor();
        assertEquals(Arrays.asList(), primeFactor.of(1));
    }

    @Test
    void testPrimeFactorOf2() {
        PrimeFactor primeFactor = new PrimeFactor();
        assertEquals(Arrays.asList(2), primeFactor.of(2));
    }
}