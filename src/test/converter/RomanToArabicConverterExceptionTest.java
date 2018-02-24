package test.converter;

import main.converter.RomanToArabicConverter;
import org.junit.Test;

public class RomanToArabicConverterExceptionTest {
  private RomanToArabicConverter romanToArabicConverterConverter = new RomanToArabicConverter();

  @Test(expected = IllegalArgumentException.class)
  public void shouldReturnIllegalArgumentExceptionWhenNotRoman() {
    romanToArabicConverterConverter.getArabic("eefef");
  }

}
