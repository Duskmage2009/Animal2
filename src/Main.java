import AnimalPack.*;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(3);
        cat.setAge(5);
        cat.setName("Finik");
        Dog dog = new Dog(4);
        AngryDog angryDog = new AngryDog(5);
        Cow cow = new Cow(2);
        SuperCat superCat = new SuperCat(4);
        RedBull redBull = new RedBull(3);
        Animal[] animals = {cat, dog, cow, angryDog, superCat};

        for (Animal all :
                animals) {
            all.voice();
        }

        Delegator delegator = new Delegator();
        System.out.println(delegator.toStringAnimal(cat));

    }
}
