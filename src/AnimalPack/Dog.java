package AnimalPack;

public class Dog extends Animal{
    @Override
    public void voice() {
        System.out.println("Mr Dog says: GAV-GAV");
    }

    public Dog(int age) {
        super("Doggy",age);
    }

    public Dog(String name, int age) {
        super(name, age);
    }
}