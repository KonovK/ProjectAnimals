package animal;

public class Tiger extends Animal{

    @Override
    public void info(){
        System.out.println(name + " " + age);
    }

    public Tiger(int age, String name) {
        this.name = name;
        this.age = age;
    }
}
