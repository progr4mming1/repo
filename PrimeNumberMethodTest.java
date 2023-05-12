package p6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeNumberMethodTest {

    @Test
    public void testIsPrimeWithPrimeNumbers() {
        assertTrue(PrimeNumberMethod.isPrime(2), "2 should be a prime number");
        assertTrue(PrimeNumberMethod.isPrime(3), "3 should be a prime number");
        assertTrue(PrimeNumberMethod.isPrime(7), "7 should be a prime number");
        assertTrue(PrimeNumberMethod.isPrime(13), "13 should be a prime number");
        assertTrue(PrimeNumberMethod.isPrime(89), "89 should be a prime number");
       
    }

    @Test
    public void testIsPrimeWithNonPrimeNumbers() {
        assertFalse(PrimeNumberMethod.isPrime(4), "4 should not be a prime number");
        assertFalse(PrimeNumberMethod.isPrime(6), "6 should not be a prime number");
        assertFalse(PrimeNumberMethod.isPrime(15), "15 should not be a prime number");
        assertFalse(PrimeNumberMethod.isPrime(20), "20 should not be a prime number");
        assertFalse(PrimeNumberMethod.isPrime(91), "91 should not be a prime number");
    }


}
