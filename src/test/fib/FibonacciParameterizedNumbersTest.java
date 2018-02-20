package test.fib;

import main.fib.FibonacciNumbers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FibonacciParameterizedNumbersTest {

    private final int input;
    private final int output;
//    private FibonacciNumbers fibonacciNumbers;
//
//    @Before
//    public void init() {
//        fibonacciNumbers = new FibonacciNumbers();
//    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, 0},
                {1, 1},
                {2, 1},
                {3, 2},
                {4, 3},
                {5, 5},
                {6, 8},
                {7, 13},
        });
    }

    public FibonacciParameterizedNumbersTest(int input, int output) {
        this.input = input;
        this.output = output;
    }

    @Test(timeout = 10)
    public void shouldBeTrueInMethodFib() {
        FibonacciNumbers fibonacciNumbers = new FibonacciNumbers(); //Fixture -> System Under Test
        int result = fibonacciNumbers.fib(input); //Exercise
        assertEquals(result, output); // Verify
    }
}