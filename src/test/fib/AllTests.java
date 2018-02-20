package test.fib;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({FibonacciNegativeNumbersTest.class, FibonacciParameterizedNumbersTest.class})
public class AllTests {
}
