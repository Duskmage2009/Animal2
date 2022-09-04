package AnimalPack;

public class Cat extends Animal{
    @Override
    public void voice() {
        System.out.println("Mr Cat says : meow!");
    }

    public Cat(int age) {
        super("Kitty",age);
    }

    public Cat(String name, int age) {
        super(name, age);
    }
}