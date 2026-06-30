class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    private boolean isIndoor;
    
    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }
    public boolean isIndoor() {
        return isIndoor;
    }
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class animal_inharitance {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        Cat cat = new Cat("Whiskers", 2, true);

        System.out.println("Dog Name: " + dog.getName());
        System.out.println("Dog Age: " + dog.getAge());
        System.out.println("Dog Breed: " + dog.getBreed());
        dog.makeSound();

        System.out.println();

        System.out.println("Cat Name: " + cat.getName());
        System.out.println("Cat Age: " + cat.getAge());
        System.out.println("Is Cat Indoor: " + cat.isIndoor());
        cat.makeSound();
    }
}