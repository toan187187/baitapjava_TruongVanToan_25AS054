package BT4_6;

class Animal {
    private String name;

    public Animal(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Animal[name = " + name +"]";
    }
}

class Mammal extends Animal{
    public Mammal(String name){
        super(name);
    }

    @Override
    public String toString() {
        return "Mammal:[ " + super.toString() + "]";
    }
}

class Cat extends Mammal {
    public Cat (String name){
        super(name);
    }

    public void greets(String meow){
        System.out.println(meow);
    }

    @Override
    public String toString() {
        return "Cat["+super.toString()+"]";
    }
}

class Dog extends Mammal{
    public Dog(String name){
        super(name);
    }

    public void greets(String Woof){
        System.out.println(Woof);
    }

    public void greets(Dog another){
        System.out.println("Woooof");
    }
}
class Main {
    public static void main(String [] args){
        Animal a1 = new Animal("vang");
        System.out.println(a1.toString());

        Mammal m1 = new Mammal("people");
        System.out.println(m1.toString());

        Cat c1 = new Cat("vang");
        System.out.println(c1.toString() );

        Dog d1 = new Dog("ccoc");
        Dog d2 = new Dog("cawsda");
        d1.greets("gau");
        d1.greets("gueuuw");
    }
}
