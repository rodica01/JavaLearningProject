package md.tekwillacademy.operationsandciclicfunctions;

import java.sql.SQLOutput;

public class GradeSystemService {
    public static void main(String[] args) {
        int grade = 50;

        if (grade >= 90){
            System.out.println("Grade: A");
        } else if (grade >= 80){
            System.out.println("Grade: B");
        } else if (grade >= 70) {
            System.out.println("Grade: C");
        } else if (grade >= 60) {
            System.out.println("Grade: D");
        } else{
            System.out.println("You didn't pass the exam!");
        }
    }
}