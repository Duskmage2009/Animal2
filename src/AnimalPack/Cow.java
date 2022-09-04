package AnimalPack;

public class Cow extends Animal {
    @Override
    public void voice() {
        System.out.println("MOOOOOOOOOOOOOOOOOOOOO-MOOOOOOOOOOOOOOOO!");
    }

    public Cow(int age) {
        super("COWY-COWY",age);
    }

    public Cow(String name, int age) {
        super(name, age);
    }
}