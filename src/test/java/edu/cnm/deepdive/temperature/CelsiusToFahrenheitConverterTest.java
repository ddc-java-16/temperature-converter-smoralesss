package edu.cnm.deepdive.temperature;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class CelsiusToFahrenheitConverterTest {

  @ParameterizedTest
  @CsvFileSource(resources = "c-to-f.csv", useHeadersInDisplayName = true)
  void convert(double celsius, double expectedFahrenheit) {
//    double freezingCelsius = 0;
//    double expectedFreezingFahrenheit = 32;
//    double actualFreezingFahrenheit = new CelsiusToFahrenheitConverter().convert(freezingCelsius);
//    assert expectedFreezingFahrenheit == actualFreezingFahrenheit;

    assertEquals(
        expectedFahrenheit,
        new CelsiusToFahrenheitConverter().convert(celsius),
        0.00001
        );

  }

}