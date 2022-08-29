package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

   @ParameterizedTest
//   @CsvSource({
//           "200, 300, 3, middle range",
//   })
   @CsvFileSource(files="src/test/resources/bound.csv")
   public void shouldNumberOfSquares( int lowerBound, int upperBound, int expected) {
       SQRService sqr = new SQRService();

       int actual = sqr.calcSqrt(lowerBound, upperBound);

       Assertions.assertEquals(expected, actual);
    }
}