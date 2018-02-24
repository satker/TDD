package test.converter;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import main.converter.RomanToArabicConverter;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class RomanToArabicConverterTest {

  private String input;
  private int output;
  private RomanToArabicConverter romanToArabicConverter;

  @Before
  public void init() {
    romanToArabicConverter = new RomanToArabicConverter();
  }

  @Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(new Object[][]{
        {"I", 1},
        {"II", 2},
        {"III", 3},
        {"IV", 4},
        {"V", 5},
        {"VI", 6},
        {"VII", 7},
        {"VIII", 8},
        {"IX", 9},
        {"X", 10},
        {"XI", 11},
        {"XII", 12},
        {"XIII", 13},
        {"XIV", 14},
        {"XV", 15},
        {"XVI", 16},
        {"XVII", 17},
        {"XVIII", 18},
        {"XIX", 19},
        {"XX", 20},
        {"XXV", 25},
        {"XXX", 30},
        {"XLIV", 44},
        {"L", 50},
        {"LXX", 70},
        {"LXXXIX", 89},
        {"XCIX", 99},
        {"CXXIII", 123},
        {"CC", 200},
        {"CCCLXXXIX", 389},
        {"CD", 400},
        {"D", 500},
        {"DC", 600},
        {"DCC", 700},
        {"DCCC", 800},
        {"CM", 900},
        {"CMXCIX", 999},
        {"M", 1000},
    });
  }

  public RomanToArabicConverterTest(String input, int output) {
    this.input = input;
    this.output = output;
  }

  @Test
  public void shouldBeTrue() {
    int arabic = romanToArabicConverter.getArabic(input);
    assertEquals(arabic, output);
  }
}
