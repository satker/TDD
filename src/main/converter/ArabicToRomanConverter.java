package main.converter;

public class ArabicToRomanConverter {

  private static final int[] INIT_ARABIC = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 50, 100};
  private static final String[] INIT_STRING = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII",
      "IX", "X", "L", "C"};

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
          String digitRomanNumber = getRomanIfPresentInitArabic(
              Math.pow(10, (arabicToString.length() - i - 1)));
          for (int j = 0; j < digit; j++) {
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
        roman = INIT_STRING[i];
      }
    }
    return roman;
  }
}
