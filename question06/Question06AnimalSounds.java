package labsheet06.question06;

abstract class Animal {
    public abstract void sound();
}

class Lion extends Animal {
    @Override
    public void sound() {
        System.out.println("Lion: Roar!");
    }
}

class Tiger extends Animal {
    @Override
    public void sound() {
        System.out.println("Tiger: Growl!");
    }
}

public class Question06AnimalSounds {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        lion.sound();
        tiger.sound();
    }
}