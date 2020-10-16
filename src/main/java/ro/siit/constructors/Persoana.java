package ro.siit.constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Persoana {

    private String name;
    private Integer age;
    private List<Hobby> hobbies = new ArrayList<>();

    public Persoana(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    protected String getName() {
        return name;
    }

    protected Integer getAge() {
        return age;
    }

    void introduceYourself(){
        System.out.println("I am " + name + " and I am " + age + " years old!");
    }

    public void setHobbies(List<Hobby> hobbies) {
        this.hobbies = hobbies;
    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }

    public void adaugareHobby(Hobby hobby){
        hobbies.add(hobby);
    }

    @Override
    public boolean equals(Object p){
        if (this == p) return true;
        if (p == null || getClass() != getClass()) return false;
        Persoana persoana = (Persoana) p;
        return age == persoana.age && name.equals(persoana.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

}
