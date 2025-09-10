class Laptop {
    void compile() {
        System.out.println("Compiling...");
    }
}

class Alien {
    private int age;
    private Laptop laptop;

    // Constructor
    public Alien(int age, Laptop laptop) {
        this.age = age;
        this.laptop = laptop;
    }

    void code() {
        System.out.println("Alien age: " + age);
        laptop.compile();
    }
}

public class Test {
    public static void main(String[] args) {
        // Manually create objects
        Laptop lap = new Laptop();
        Alien a1 = new Alien(21, lap);  // constructor injection

        a1.code();
    }
}
