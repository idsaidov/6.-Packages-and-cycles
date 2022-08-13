package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

   @ParameterizedTest
//   @CsvSource({
//           "200, 300, 15, middle range",
//           "100, 100, 10, lower Bound",
//           "9801, 9801, 99, upper Bound"
//   })
   @CsvFileSource(files="src\\test\\resources\\bound.csv")
   public void shouldCountSquares( int lowerBound, int upperBound, int expected) {
       SQRService sqr = new SQRService();

       int actual = sqr.calcSqrt(lowerBound, upperBound);

       Assertions.assertEquals(expected, actual);


    }
}