package com.lbaes.laboratorio;

public class DriverAgeClassifier {
    public static String ClassifyDriverAge(int driverAge) {
        if (driverAge < 50) {
            return "a cada 10 anos";
        } else if (driverAge < 70) {
            return "a cada 5 anos";
        } else {
            return "a cada 3 anos";
        }
    }
}
