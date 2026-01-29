class Day5Methods{

    static void welcome() {
        System.out.println("Welcome to Java");
    }

    int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        welcome();
        Day5Methods obj = new Day5Methods();
        int result = obj.multiply(4, 5);
        System.out.println(result);
    }
}
