package com.lbaes.laboratorio;

public class StudentGradeValidator {
    public static String ValidateGrade(float grade) {
        if (grade >= 0.0f && grade <= 10.0f){
            return "Valido";
        }
        return "Invalido";
    }
}
