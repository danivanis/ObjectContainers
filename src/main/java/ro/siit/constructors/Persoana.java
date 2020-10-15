package ro.siit.constructors;

import ro.siit.interfaces.Adresa;
import ro.siit.interfaces.Tara;

public class Persoana implements Adresa, Tara {

    private String name;
    private Integer age;
    private String address;
    private Integer houseNumber;
    private String countryName;

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

    public void setAddress(String address) {
        this.address = address;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public Integer getHouseNumber() {
        return houseNumber;
    }

    public String getCountryName() {
        return countryName;
    }

    void introduceYourself(){
        System.out.println("I am " + name + " and I am " + age + " years old!");
    }

    void shareStreetDetails(){
        System.out.println("I live at " + getAddress() + " street, " + "number " + getHouseNumber() + " in " + getCountryName() + "!");
    }

}
