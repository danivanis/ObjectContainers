package ro.siit.constructors;

public class Student extends Persoana {

    public Student(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void introduceYourself() {
        System.out.println("Hello dude, I'm " + getName() + " and I have " + getAge() + " years!");
    }
}
