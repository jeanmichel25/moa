package moa.classifiers;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrimeNumFinderTestSuite {

    @Test
    public void isPrime() {

        assertEquals(PrimeNumFinder.isPrime(-5), true);
        assertEquals(PrimeNumFinder.isPrime(7), true);
        assertEquals(PrimeNumFinder.isPrime(-31), true);
        assertEquals(PrimeNumFinder.isPrime(79), true);
        assertEquals(PrimeNumFinder.isPrime(-83), true);
    }

    @Test
    public void isNotPrime() {

        assertEquals(PrimeNumFinder.isPrime(-6), false);
        assertEquals(PrimeNumFinder.isPrime(100), false);
        assertEquals(PrimeNumFinder.isPrime(-120), false);
        assertEquals(PrimeNumFinder.isPrime(222), false);
        assertEquals(PrimeNumFinder.isPrime(-324), false);
    }
}