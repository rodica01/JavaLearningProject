package md.tekwillacademy.methodstask;

import java.util.Random;
import java.util.UUID;

public class DataGeneratorUtil {

    public static int generateRandomInt(int limit){
        Random random = new Random();
       return  random.nextInt(limit);
    }

//    public static int generateRandomInt(int min, int max){
//        Random random = new Random();
//        int randomNumber = random.nextInt();
//        return randomNumber;
//    }

    public  static  String returnRandomString (String domain){
        String uuid = UUID.randomUUID().toString();
        return uuid + "@" + domain;
    }

    public  static  String returnRandomString (){
        String uuid = UUID.randomUUID().toString();
        return uuid + "@gmail.com";
    }
}

