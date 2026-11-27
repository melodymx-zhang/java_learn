// Root (parent / base) class
class Animal implements AutoCloseable {
    // Instance field: each Animal object has its own name
    protected String name;

    // Static field: shared across the entire Animal class (not per object)
    private static int animalCount = 0;

    // Constructor: runs when an object is initialized with 'new'
    public Animal(String name) {
        this.name = name;
        animalCount++;
        System.out.println("[Init] Created Animal: " + name);
    }

    // Object (instance) method: called on a specific object, can be overridden by subclasses
    public void speak() {
        System.out.println(name + " makes a generic sound.");
    }

    // Class (static) method: called on the class itself (Animal.getAnimalCount())
    public static int getAnimalCount() {
        return animalCount;
    }

    // Java does NOT have C++-style destructors (finalize() is deprecated).
    // Instead, AutoCloseable.close() is used with try-with-resources for deterministic cleanup,
    // and unused objects are automatically reclaimed later by the Garbage Collector (GC).
    @Override
    public void close() {
        animalCount--;
        System.out.println("[Cleanup] Closed/released resources for: " + name);
    }
}

// Subclass 1 inheriting from Animal
class Dog extends Animal {
    public Dog(String name) {
        super(name); // Call parent (Animal) constructor
        System.out.println("[Init] Dog constructor called for: " + name);
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Woof!");
    }

    public void fetch() {
        System.out.println(name + " fetches the ball.");
    }

    @Override
    public void close() {
        System.out.println("[Destroy] Dog close() called for: " + name);
        super.close();
    }
}

// Subclass 2 inheriting from Animal
class Cat extends Animal {
    public Cat(String name) {
        super(name);
        System.out.println("[Init] Cat constructor called for: " + name);
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Meow!");
    }

    public void purr() {
        System.out.println(name + " is purring.");
    }

    @Override
    public void close() {
        System.out.println("[Destroy] Cat close() called for: " + name);
        super.close();
    }
}

// Subclass 3 inheriting from Animal
class Bird extends Animal {
    public Bird(String name) {
        super(name);
        System.out.println("[Init] Bird constructor called for: " + name);
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Tweet!");
    }

    public void fly() {
        System.out.println(name + " flies into the sky.");
    }

    @Override
    public void close() {
        System.out.println("[Destroy] Bird close() called for: " + name);
        super.close();
    }
}

public class OOPExample {
    public static void main(String[] args) {
        // 1. Object initialization (calling constructors)
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");
        Bird bird = new Bird("Tweety");

        // 2. Calling class static method
        System.out.println("Total active animals: " + Animal.getAnimalCount());

        // 3. Calling object (instance) methods & polymorphism
        Animal[] pets = {dog, cat, bird};
        for (Animal pet : pets) {
            pet.speak(); // Calls each subclass's overridden speak()
        }

        // Calling subclass-specific object methods
        dog.fetch();
        cat.purr();
        bird.fly();

        // 4. Deterministic object cleanup via try-with-resources (calls close() automatically)
        try (Dog tempDog = new Dog("Temporary")) {
            tempDog.speak();
            System.out.println("Total active animals inside try: " + Animal.getAnimalCount());
        } // tempDog.close() is called automatically here

        System.out.println("Total active animals after try-with-resources: " + Animal.getAnimalCount());

        // 5. Explicitly close remaining objects and clear references for Garbage Collection
        dog.close();
        cat.close();
        bird.close();
        dog = null;
        cat = null;
        bird = null;
        System.out.println("Total active animals at end: " + Animal.getAnimalCount());
        System.out.println("References cleared; objects are now eligible for Garbage Collection.");
    }
}
