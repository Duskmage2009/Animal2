package AnimalPack;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(int age) {

        this("Mr. Funny",age);
    }

    public Animal(String name, int age) {
        if(name.isEmpty()){
            this.name= "What's a funny animal";
        }
        if(age<=0){
            this.age=3;
        }
    }

    public abstract void voice();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}