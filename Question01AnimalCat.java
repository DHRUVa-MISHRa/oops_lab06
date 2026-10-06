package labsheet06.question01;

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat barks.");
    }
}

public class Question01AnimalCat {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
    }
}