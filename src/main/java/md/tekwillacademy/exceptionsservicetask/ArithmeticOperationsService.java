package md.tekwillacademy.exceptionsservicetask;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ArithmeticOperationsService {
    public static double divideWithoutExceptionHandling(int a, int b) {
        return a / b;
    }

    public static double divideWithExceptionHandling(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException captureException) {
            System.out.println(captureException.getMessage());
            return 0;
        }
    }

}