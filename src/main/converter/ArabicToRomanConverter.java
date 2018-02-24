package main.converter;

import static main.converter.InitConstantNumerals.INIT_ARABIC;
import static main.converter.InitConstantNumerals.INIT_ROMAN;

public class ArabicToRomanConverter {

  public String getRoman(int arabic) {
    if (getRomanIfPresentInitArabic(arabic) != null) {
      return getRomanIfPresentInitArabic(arabic);
    } else {
      return getRomanIfNotPattern(arabic);
    }
  }

  private String getRomanIfNotPattern(int arabic) {
    StringBuilder roman = new StringBuilder();
    String arabicToString = String.valueOf(arabic);
    for (int i = 0; i < arabicToString.length(); i++) {
      int digit = Character.getNumericValue(arabicToString.charAt(i));
      if (digit != 0) {
        if (i == arabicToString.length() - 1) {
          roman.append(getRomanIfPresentInitArabic(digit));
        } else {
          double a = digit * Math.pow(10, (arabicToString.length() - i - 1));
          if (getRomanIfPresentInitArabic(a) != null) {
            roman.append(getRomanIfPresentInitArabic(a));
          } else {
            String digitRomanNumber = getRomanIfPresentInitArabic(a / digit);
            for (int j = 0; j < digit; j++) {
              roman.append(digitRomanNumber);
            }
          }
        }
      }
    }
    return roman.toString();
  }

  private String getRomanIfPresentInitArabic(double arabic) {
    String roman = null;
    for (int i = 0; i < INIT_ARABIC.length; i++) {
      if (INIT_ARABIC[i] == arabic) {
        roman = INIT_ROMAN[i];
      }
    }
    return roman;
  }
}
