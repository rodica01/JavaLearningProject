package md.tekwillacademy.methodstask;

public class Customer {

    private   int id;

    private   String name;

    private int age;

    private   String address;

    public Customer (int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Customer (){

    }

    //Setters

public void setId (int idFormalParam){
      id = idFormalParam;
}
public void setName (String nameFormalParam){
      name = nameFormalParam;
}

public void setAddress(String address) {
      this.address = address;
}

public void setAge(int ageInput) {
    if ((ageInput > 0) && (ageInput <= 115)){
        this.age = ageInput;
    }else{
        System.out.println("The property is not valid, please add another age");
    }
}

    // Getters

public int getId(){
        return this.id;
}

public int getAge(){
        return this.age;

}

public String getName(){
        return this.name;
}

public String getAddress(){
        return this.address;
}
}
