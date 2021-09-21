package com.lbaes.tests;

import com.lbaes.laboratorio.YearValidator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class YearValidatorTest {

    @ParameterizedTest(name = "Year {0} is a valid Year")
    @ValueSource(ints = {1950, 2020, 2012, 1999})
    void validateYear_WhenYearIsBetween1900and2020_ShouldReturnTrue(int year) {

        // Act
        boolean valid = YearValidator.ValidateYear(year);

        // Assert
        assertEquals(true, valid);
    }

    @ParameterizedTest(name = "Year {0} is NOT a valid Year")
    @ValueSource(ints = {2021, 2022, 3000, 4050})
    void validateYear_WhenYearIsGreaterThan2020_ShouldReturnFalse(int year) {

        // Act
        boolean valid = YearValidator.ValidateYear(year);

        // Assert
        assertEquals(false, valid);
    }

    @ParameterizedTest(name = "Year {0} is NOT a valid Year")
    @ValueSource(ints = {1899, 1700, -1000, 0})
    void validateYear_WhenYearIsLessThan1900_ShouldReturnFalse(int year) {

        // Act
        boolean valid = YearValidator.ValidateYear(year);

        // Assert
        assertEquals(false, valid);
    }
}