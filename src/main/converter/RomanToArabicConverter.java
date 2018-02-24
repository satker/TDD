package main.converter;

import static main.converter.InitConstantNumerals.INIT_ARABIC;
import static main.converter.InitConstantNumerals.INIT_ROMAN;

import java.util.Objects;

public class RomanToArabicConverter {

  public int getArabic(String input) {
    return searchArabicInPatterns(input, 0);
  }

  private int searchArabicInPatterns(String roman, int result) {
    String[] inputArray = roman.trim()
                               .split("");
    for (int i = inputArray.length - 1; i >= 0; i--) {
      StringBuilder stringForSearch = new StringBuilder();
      for (int j = 0; j <= i; j++) {
        stringForSearch.append(inputArray[j]);
      }
      for (int j = 0; j < INIT_ROMAN.length; j++) {
        if (Objects.equals(INIT_ROMAN[j], stringForSearch.toString())) {
          result += INIT_ARABIC[j];
          String nextString = roman.replaceFirst(
              stringForSearch.toString(), "");
          if (i == inputArray.length - 1) {
            return result;
          } else {
            return searchArabicInPatterns(nextString, result);
          }
        }
      }
    }
    throw new IllegalArgumentException();
  }
}
