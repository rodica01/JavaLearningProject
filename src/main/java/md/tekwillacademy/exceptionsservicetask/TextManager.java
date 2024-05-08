package md.tekwillacademy.exceptionsservicetask;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TextManager {
    public static int getTheTextLength (String text){
        return text.length();
    }

    // daca nu stim daca sa punem NullPointerException, putem pune Exception din motiv ca este mai superior

    public static int getTheTextLengthWithTryAndCatch(String text){
        try{
            return text.length();
        } catch (NullPointerException exceptionObject){
            System.out.println("There is an exception: " + exceptionObject.getMessage());
            return 0;
        } finally {
            System.out.println("This block is executed each time!");
        }
    }

    // prin metoda if, insa nu este o metoda corecta

    public static int getTheTextLengthWithIf (String text){
        if (text == null){
            return 0;
        } else{
            return text.length();
        }
    }

    public static void readDataWithTryCatch(String filename){
        try {
            FileReader fileReader = new FileReader(filename);
        } catch (FileNotFoundException exception){
            System.out.println("Continuam executia dar afisam mesajul stocat in obiectul capturat " + exception.getMessage());
        }
        System.out.println("File reader has been created!");
    }

    public static void readWithoutTryAndCatch(String filename) throws FileNotFoundException {
    FileReader fileReader = new FileReader(filename);
        System.out.println("Metoda a fost executata!");
   }
}

