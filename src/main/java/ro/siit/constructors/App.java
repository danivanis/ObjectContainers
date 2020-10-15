package ro.siit.constructors;

public class App {

    public static void main(String[] args) {

        Persoana persoana1 = new Persoana();
        persoana1.setName("Ion");
        persoana1.setAge(32);
        persoana1.introduceYourself();

        Persoana persoana2 = new Persoana();
        persoana2.setName("Gheorghe");
        persoana2.setAge(32);
        persoana2.introduceYourself();

        Student student1 = new Student();
        student1.setName("Ion Ionescu");
        student1.setAge(21);
        student1.introduceYourself();

        Persoana angajat1 = new Angajat();
        angajat1.setAddress("Mihai Eminescu");
        angajat1.setHouseNumber(12);
        angajat1.setCountryName("Romania");
        angajat1.shareStreetDetails();
    }
}
