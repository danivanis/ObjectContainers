package ro.siit.constructors;

public class Angajat extends Persoana{

    public Angajat(String name, Integer age) {
        super(name, age);
    }

    void getPaycheck(){
        System.out.println("Hooray, I have money to spend!");
    }

}
