package com.lbaes.tests;

import com.lbaes.laboratorio.DriverAgeClassifier;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class DriverAgeClassifierTest {

    private static String TEN_YEARS = "a cada 10 anos";
    private static String FIVE_YEARS = "a cada 5 anos";
    private static String THREE_YEARS = "a cada 3 anos";

    @ParameterizedTest(name = "[age < 50] {0} is a cada 10 anos")
    @ValueSource(ints = {70, 71, 80, 81, 90, 92, 103, 150})
    void classifyDriverAge_WhenAgeIsLessThan50AndGreaterThan0_ShouldReturnStringEqualTo(int driverAge) {
        // Arrange
        String expectedString = TEN_YEARS;

        // Act
        String actual = DriverAgeClassifier.ClassifyDriverAge(driverAge);

        // Assert
        assertEquals(expectedString, actual);
    }

    @ParameterizedTest(name = "[ age >= 50 and age < 70 ] {0} is a cada 5 anos")
    @ValueSource(ints = {70, 71, 80, 81, 90, 92, 103, 150})
    void classifyDriverAge_WhenAgeIsGreaterThanOrEqualTo50AndLessThan70_ShouldReturnFIVE_YEARSString(int driverAge) {
        // Arrange
        String expectedString = FIVE_YEARS;

        // Act
        String actual = DriverAgeClassifier.ClassifyDriverAge(driverAge);

        // Assert
        assertEquals(expectedString, actual);
    }

    @ParameterizedTest(name = "[age >= 70] {0} is a cada 10 anos")
    @ValueSource(ints = {70, 71, 80, 81, 90, 92, 103, 150})
    void classifyDriverAge_WhenAgeIsGreaterThanOrEqualTo70_ShouldReturnTEN_YEARSString(int driverAge) {
        // Arrange
        String expectedString = THREE_YEARS;

        // Act
        String actual = DriverAgeClassifier.ClassifyDriverAge(driverAge);

        // Assert
        assertEquals(expectedString, actual);
    }
}