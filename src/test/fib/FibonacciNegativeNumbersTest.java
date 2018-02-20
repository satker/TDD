package test.fib;

import main.fib.FibonacciNumbers;
import org.junit.Test;

import static junit.framework.TestCase.fail;

public class FibonacciNegativeNumbersTest {
    @Test
    public void shouldThrowExceptionWhenNegative(){
        FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
        try {
            fibonacciNumbers.fib(-1);
            fail("should throw IllegalArgumentException");
        } catch (IllegalArgumentException e){

        }
    }
}
