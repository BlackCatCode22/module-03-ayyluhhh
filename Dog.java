package myanimals;

public class Dog {

    private static int dogCount = 0;

    String name;
    int age;

    public void woof() {
        System.out.println("woof");
    }
    public Dog () {
        dogCount++;
    }
    public static int getDogCount() {
        return dogCount;
    }
}
