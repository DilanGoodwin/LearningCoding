import org.junit.Test
import junit.framework.TestCase
import org.junit.Assert._
import Primes._

class TestFindNextPrime{
    @Test def testIsPrime1{
        assertFalse("Negative numbers are not prime",isPrime(-5))
    }
    @Test def testIsPrime2{
        assertFalse("0 us not prime",isPrime(0))
    }
    @Test def testIsPrime3{
        assertFalse("1 is not prime",isPrime(1))
    }
    @Test def testIsPrime4{
        assertTrue("2 is the lowest prime",isPrime(2))
    }
    @Test def testIsPrime5{
        assertTrue("3 is prime",isPrime(3))
    }
    @Test def testIsPrime6{
        assertFalse("4 is not prime",isPrime(4))
    }
}
class EPNextPrime{
    @Test def epNegativeNumbers{
        assertFalse("Int.MinValue not prime",isPrime(Int.MinValue))
        assertFalse("-1 not prime",isPrime(-1))
    }
    @Test def epBeforePrime{
        assertFalse("0 not prime",isPrime(0))
        assertFalse("1 not prime",isPrime(1))
    }
    @Test def epPrimes{
        assertTrue("2 is prime",isPrime(2))
        assertTrue("7 is prime",isPrime(7))
    }
    @Test def epAfterPrime{
        assertFalse("4 not prime",isPrime(4))
        assertFalse("10 not prime",isPrime(10))
    }
}

class NextCandidate{
    @Test def MinValue{
        assertTrue("Next candidate should be 2",isPrime(getNextCandidate(1)))
        assertTrue("Next candidate should be 2",isPrime(getNextCandidate(-1)))
    }
}