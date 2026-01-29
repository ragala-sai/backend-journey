class Day6Constructors {

    int id;
    String name;

    Day6Constructors() {
        System.out.println("Default constructor called");
    }

    Day6Constructors(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Day6Constructors s1 = new Day6Constructors();
        Day6Constructors s2 = new Day6Constructors(1, "Sai");

        s2.display();

        System.out.println(s2.add(10, 20));
        System.out.println(s2.add(1, 2, 3));
    }
}
