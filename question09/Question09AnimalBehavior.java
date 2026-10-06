package labsheet06.question09;

abstract class Animal {
    public abstract void eat();

    public abstract void sleep();
}

class Lion extends Animal {
    @Override
    public void eat() {
        System.out.println("Lion hunts and eats meat.");
    }

    @Override
    public void sleep() {
        System.out.println("Lion rests in its den.");
    }
}

class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("Tiger catches and eats prey.");
    }

    @Override
    public void sleep() {
        System.out.println("Tiger sleeps in a sheltered area.");
    }
}

class Deer extends Animal {
    @Override
    public void eat() {
        System.out.println("Deer grazes on grass and leaves.");
    }

    @Override
    public void sleep() {
        System.out.println("Deer rests in a quiet, safe place.");
    }
}

public class Question09AnimalBehavior {
    public static void main(String[] args) {
        Animal[] animals = {new Lion(), new Tiger(), new Deer()};
        for (int i = 0; i < animals.length; i++) {
            animals[i].eat();
            animals[i].sleep();
        }
    }
}