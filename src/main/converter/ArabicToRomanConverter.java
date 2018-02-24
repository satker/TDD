package main.converter;

import static main.converter.InitConstantNumerals.INIT_ARABIC;
import static main.converter.InitConstantNumerals.INIT_ROMAN;

public class ArabicToRomanConverter {

  public String getRoman(int arabic) {
    if (arabic < 1 || arabic > 1000) {
      throw new IllegalArgumentException();
    }
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
      // part of number, for example first part num 123 is 1
      int partOfNumber = Character.getNumericValue(arabicToString.charAt(i));
      if (partOfNumber != 0) {
          // get digit from part, for example first part num 123 is 1, and digit is 100
          double digit = partOfNumber * Math.pow(10, (arabicToString.length() - i - 1));
          if (getRomanIfPresentInitArabic(digit) != null) {
            // if digit present then append it to result
            roman.append(getRomanIfPresentInitArabic(digit));
          } else {
            // if number is big, append some roman numbers to result,
            // example number 300, search 100 in pattern and add it 3 times
            String digitRomanNumber = getRomanIfPresentInitArabic(digit / partOfNumber);
            for (int j = 0; j < partOfNumber; j++) {
              roman.append(digitRomanNumber);
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
