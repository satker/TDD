package test.converter;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import main.converter.ArabicToRomanConverter;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ArabicToRomanConverterTest {

  private int input;
  private String output;
  private ArabicToRomanConverter arabicToRomanConverter;

  @Before
  public void init() {
    arabicToRomanConverter = new ArabicToRomanConverter();
  }

  @Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(new Object[][]{
        {1, "I"},
        {2, "II"},
        {3, "III"},
        {4, "IV"},
        {5, "V"},
        {6, "VI"},
        {7, "VII"},
        {8, "VIII"},
        {9, "IX"},
        {10, "X"},
        {11, "XI"},
        {12, "XII"},
        {13, "XIII"},
        {14, "XIV"},
        {15, "XV"},
        {16, "XVI"},
        {17, "XVII"},
        {18, "XVIII"},
        {19, "XIX"},
        {20, "XX"},
        {25, "XXV"},
        {30, "XXX"},
        {50, "L"},
        {99, "XCIX"},
        {123, "CXXIII" }
    });
  }

  public ArabicToRomanConverterTest(int input, String output) {
    this.input = input;
    this.output = output;
  }

  @Test
  public void shouldBeTrue() {
    String roman = arabicToRomanConverter.getRoman(input);
    assertEquals(roman, output);
  }

}
