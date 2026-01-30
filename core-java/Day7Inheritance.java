class Parent {
    void display() {
        System.out.println("This is Parent class");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is Child class");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.display();
        c.show();
    }
}
