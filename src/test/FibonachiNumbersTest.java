package test;

import static org.junit.Assert.assertEquals;

import java.FibonachiNumbers;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FibonachiNumbersTest {

  private final int input;
  private final int output;
  private FibonachiNumbers fibonachiNumbers;

  @Before
  public void init() {
    fibonachiNumbers = new FibonachiNumbers();
  }

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
        {7, 13}
    });
  }

  public FibonachiNumbersTest(int input, int output) {
    this.input = input;
    this.output = output;
  }

  @Test
  public void shouldBeTrueInMethodFib() {
    int result = fibonachiNumbers.fib(input);
    assertEquals(result, output);
  }
}