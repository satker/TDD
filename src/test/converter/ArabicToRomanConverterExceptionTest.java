package test.converter;

import main.converter.ArabicToRomanConverter;
import org.junit.Test;

public class ArabicToRomanConverterExceptionTest {

  private ArabicToRomanConverter arabicToRomanConverter = new ArabicToRomanConverter();

  @Test(expected = IllegalArgumentException.class)
  public void shouldReturnIllegalArgumentExceptionWhenLessOneAndMoreThousand() {
    arabicToRomanConverter.getRoman(-1);
  }

  @Test(expected = IllegalArgumentException.class)
  public void shouldReturnIllegalArgumentExceptionWhenMoreThousand() {
    arabicToRomanConverter.getRoman(1001);
  }

}
