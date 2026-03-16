package lab7tasks;

public class Animal {
    void makeSound() {
        System.out.println("Animals make sounds");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dogs make 'BARK' sound");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cats make 'MEOW' sound");
    }
}

class Cow extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cows make 'MOO' sound");
    }
}

class main1{
    public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();
        Animal b = new Cow();
        d.makeSound();
        c.makeSound();
        b.makeSound();

    }
}