class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("DENA W00F W00F!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("MIAOWWW!");
    }
}

class Cow extends Animal {
    @Override
    void makeSound() {
        System.out.println("MOOOOOOOOO!");
    }
}

public class Main {
    public static void main(String[] args) {
        // polymorphism
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Animal myCow = new Cow();

        myDog.makeSound();
        myCat.makeSound();
        myCow.makeSound();
    }
}