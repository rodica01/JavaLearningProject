package md.tekwillacademy.methodstask;

import javax.xml.crypto.Data;

public class ExecutionService {
    public static void main(String[] args) {

        Customer marcelCustomer = new Customer();

        marcelCustomer.setId(DataGeneratorUtil.generateRandomInt(999));
        marcelCustomer.setName("Marcel");
        marcelCustomer.setAge(DataGeneratorUtil.generateRandomInt(100));
        marcelCustomer.setAddress("Str. Petricani 100");


        Customer ionelCustomer = new Customer (990, "Ionel Bujorel", "Str. Bucuriei 45");

        ionelCustomer.setId(DataGeneratorUtil.generateRandomInt(150));
        ionelCustomer.setName("Ionel Istrati");
        ionelCustomer.setAge(DataGeneratorUtil.generateRandomInt(80));
        ionelCustomer.setAddress("Str. Bucuriei 45");

        System.out.println(marcelCustomer.getId());
        System.out.println(ionelCustomer.getId());
        System.out.println(marcelCustomer.getName());
        System.out.println(ionelCustomer.getName());
        System.out.println(marcelCustomer.getAddress());
        System.out.println(ionelCustomer.getAddress());
        System.out.println(marcelCustomer.getAge());
        System.out.println(ionelCustomer.getAge());

        System.out.println(DataGeneratorUtil.generateRandomInt(90));
        System.out.println(DataGeneratorUtil.returnRandomString("gmail.com"));
        System.out.println(DataGeneratorUtil.returnRandomString());

    }
}
