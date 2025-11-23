package BT6_6;

abstract class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public abstract void greets();
}

class Cat extends Animal{
    public Cat(String name){
        super(name);
    }

    public void greets(){
        System.out.println("meow");
    }
}

class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    public void greets(){
        System.out.println("woof");
    }

    public void greets(Dog another){
        System.out.println(another+ "wooooof");
    }
}

class BigDog extends Dog{
    public BigDog(String name){
        super(name);
    }

    public void greets(){
        System.out.println("wooow");
    }

    public void greets(Dog another){
        System.out.println(another+ "wooooooow");
    }

    public void greets(BigDog another){
        System.out.println(another + "wooooooooooooow");
    }
}

class TestMain{
    public static void main(String[] args){
        Cat c1 = new Cat("vang");
        c1.greets();

        Dog d1 = new Dog("lu");
        Dog d2 = new Dog("li");
        d1.greets();
        d1.greets(d2);

        BigDog b1 = new BigDog("nuue");
        BigDog b2 = new BigDog("yyew");

        b1.greets();
        b1.greets(d1);
        b1.greets(b2);
    }
}

