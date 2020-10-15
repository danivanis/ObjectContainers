package ro.siit.constructors;

public class Student extends Persoana {

    @Override
    public void introduceYourself() {
        System.out.println("Hello dude, I'm " + getName() + " and I have " + getAge() + " years!");
    }
}
