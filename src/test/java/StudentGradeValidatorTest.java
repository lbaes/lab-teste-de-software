import com.lbaes.laboratorio.StudentGradeValidator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StudentGradeValidatorTest {

    static String ValidString = "Valido";
    static String InvalidString = "Invalido";

    @ParameterizedTest(name = "Grade {0} is valid")
    @ValueSource(floats = {0f, 1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f, 10f, 1.5f, 1.65f, 9.9f})
    void validateGrade_WhenGradeIsBetween0and10_ShouldReturnValidString(float grade) {
        String actual = StudentGradeValidator.ValidateGrade(grade);

        assertEquals(ValidString, actual);
    }

    @ParameterizedTest(name = "Grade {0} is NOT valid")
    @ValueSource(floats = {11.1f, 15f, -1.3f, 50.0f})
    void validateGrade_WhenGradeIsNotBetween0and10_ShouldReturnValidString(float grade) {
        String actual = StudentGradeValidator.ValidateGrade(grade);

        assertEquals(InvalidString, actual);
    }
}