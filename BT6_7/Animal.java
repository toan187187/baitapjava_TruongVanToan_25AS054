package BT6_7;

abstract class Animal {
    abstract public void greeting();
}

class Cat extends Animal{
    @Override
    public void greeting(){
        System.out.println("meow!");
    }
}

class Dog extends Animal{
    @Override
    public void greeting(){
        System.out.println("Woof!");
    }

    public void greeting(Dog another){
        System.out.println("Woooooooooof!");
    }
}

class BigDog extends Dog {
    @Override
    public void greeting(){
        System.out.println("Wooow!");
    }

    public void greeting(Dog another){
        System.out.println("woooooooooooooow!");
    }
}

class TestAnimal {
    public static void main(String[] args) {
        // Using the subclasses
        Cat cat1 = new Cat();
        cat1.greeting();
        Dog dog1 = new Dog();
        dog1.greeting();
        BigDog bigDog1 = new BigDog();
        bigDog1.greeting();

        // Using Polymorphism
        Animal animal1 = new Cat();
        animal1.greeting();
        Animal animal2 = new Dog();
        animal2.greeting();
        Animal animal3 = new BigDog();
        animal3.greeting();

        // Downcast
        Dog dog2 = (Dog)animal2;
        BigDog bigDog2 = (BigDog)animal3;
        Dog dog3 = (Dog)animal3;
        Cat cat2 = (Cat)animal2;
        dog2.greeting(dog3);
        dog3.greeting(dog2);
        dog2.greeting(bigDog2);
        bigDog2.greeting(dog2);
        bigDog2.greeting(bigDog1);
    }
}
