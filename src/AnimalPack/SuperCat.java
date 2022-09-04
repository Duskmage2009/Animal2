package AnimalPack;

public class SuperCat extends Cat{
    @Override
    public void voice() {
        System.out.println("It's superCat : Meay- Meay!");
    }

    public SuperCat(int age) {
        super("Super Kitty",age);
    }

    public SuperCat(String name, int age) {
        super(name, age);
    }
}