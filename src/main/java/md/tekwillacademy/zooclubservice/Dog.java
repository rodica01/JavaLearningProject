package md.tekwillacademy.zooclubservice;

public  class Dog extends Animal {

    public Dog (String dogName){
        super(dogName);
    }

    @Override
    public void eat() {
        System.out.println(getName() +  " The dog is eating bones!");
    }

    @Override
    public void makeSound() {
        System.out.println("The dog is making BRR! BRR! Wuf, wuf!");
    }
}
