package myanimals;


public class Animal {

    public static void main(String [] args) {
        System.out.println(Cat.getCatCount()); // printing this first will show 0 before cats

        Cat myCat = new Cat(); // cant tell Cat blueprint to meow
        myCat.meow(); // use individual cats to meow, non static methods can only be called on individual objects
        myCat.name = "Eli";
        myCat.age = 11;

        new Cat();
        myCat.name= "Hunter";
        myCat.age = 9;


        System.out.println(Cat.MAX_LIVES);

        System.out.println(Cat.getCatCount()); // you can call the Cat once it is static
        // printing this after cat will show 1 once cat is created

        Dog myDog = new Dog();
        myDog.woof();
        myDog.name = "Kiwi";
        myDog.age = 1;

        System.out.println(Dog.getDogCount());

        System.out.print(Cat.getCatCount() + Dog.getDogCount());

    }
}
