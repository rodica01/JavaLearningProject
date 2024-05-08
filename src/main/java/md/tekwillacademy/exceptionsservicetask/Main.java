package md.tekwillacademy.exceptionsservicetask;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        System.out.println(TextManager.getTheTextLength("mother"));

        System.out.println(TextManager.getTheTextLengthWithTryAndCatch(null));

        System.out.println(TextManager.getTheTextLength("father"));

        System.out.println(TextManager.getTheTextLengthWithTryAndCatch("Rodica"));

        try{
            TextManager.readWithoutTryAndCatch("text.txt");
        }catch (FileNotFoundException exception){
            exception.printStackTrace();
        }

        TextManager.readDataWithTryCatch("file.txt");

        try {
            TextManager.readWithoutTryAndCatch("text.txt");
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();

        }
        System.out.println("Last line!");

        System.out.println(ArithmeticOperationsService.divideWithoutExceptionHandling(10, 0));

    }
}
