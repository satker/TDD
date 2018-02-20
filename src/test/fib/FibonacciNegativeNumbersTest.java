package test.fib;

import main.fib.FibonacciNumbers;
import org.junit.Test;

import static junit.framework.TestCase.fail;

public class FibonacciNegativeNumbersTest {
//    @Test
//    public void shouldThrowExceptionWhenNegative() {
//        FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
//        try {
//            fibonacciNumbers.fib(-1);
//            fail("should throw IllegalArgumentException");
//        } catch (IllegalArgumentException e) {
//
//        }
//    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenNegative2() {
        FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
        fibonacciNumbers.fib(-1);
    }
}
