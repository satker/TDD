package test.converter;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ArabicToRomanConverterParameterizedTest.class, RomanToArabicConverterParameterizedTest.class,
ArabicToRomanConverterExceptionTest.class, RomanToArabicConverterExceptionTest.class})
public class RunAllTestsInConverter {

}
