package myanimals;

public class Cat
{

    public static final int MAX_LIVES = 9; // this allows only a max amount of lives per cat to be 9

    private static int catCount = 0; // static is private so it can not be manipulated from other classes
    // this will be static because it is a common value that is share amoung the cat class, not different per cat
    String name; // the fields are non static methods
    int age;
    int livesRemaining;

    public void meow() {
        System.out.println("meow");
    }
    public Cat () {
        catCount++;
        livesRemaining = MAX_LIVES;
    }
    public static int getCatCount() { // does not make sense to refer to non static field within a static one
        return catCount; // you can refer static fields and methods through individuals objects
    }
}
