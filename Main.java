interface Animal {
    void makeSound();   // abstract method
}

class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();   // interface reference - you can also do Dog a = new Dog();
        a.makeSound();          // calls Dog's version
    }
}