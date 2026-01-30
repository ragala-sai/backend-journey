abstract class Animal {
    abstract void sound();

    void sleep() {
        System.out.println("Animal sleeps");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

interface Flyable {
    void fly();
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("Bird flies");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {

        Animal a = new Dog();   // runtime polymorphism
        a.sound();
        a.sleep();

        Flyable f = new Bird();
        f.fly();

        if (a instanceof Dog) {
            System.out.println("Animal is Dog");
        }
    }
}
