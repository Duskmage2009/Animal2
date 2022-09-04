package AnimalPack;

public class AngryDog extends Dog {
    @Override
    public void voice() {
        System.out.println("Its angry dog : AGGGGRHHHHHHHH!!!");
    }

    public AngryDog(int age) {
        super("OMG,Angry-Dog",age);
    }

    public AngryDog(String name, int age) {
        super(name, age);
    }
}