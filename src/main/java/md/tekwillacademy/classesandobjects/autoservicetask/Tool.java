package md.tekwillacademy.classesandobjects.autoservicetask;

public class Tool {

    String nameOfTheTool;

    String material;

    public Tool(String enteredNameOfTheTool){
        nameOfTheTool = enteredNameOfTheTool;
        System.out.println("The constructor with param has been used and the material is still null.");
    }
}
