package ro.siit.constructors;


import java.util.ArrayList;
import java.util.List;

public class Hobby {

    private String hobbyName;
    private int hobbyFrequency;

    private List<Adresa> adrese;

    public Hobby (String hobbyName, int hobbyFrequency) {
        this.hobbyName = hobbyName;
        this.hobbyFrequency = hobbyFrequency;
        this.adrese = new ArrayList<>();
    }

    public void setHobbyName(String hobbyName) {
        this.hobbyName = hobbyName;
    }

    public String getHobbyName() {
        return hobbyName;
    }

    public void setHobbyFrequency(int hobbyFrequency) {
        this.hobbyFrequency = hobbyFrequency;
    }

    public int getHobbyFrequency() {
        return hobbyFrequency;
    }

    public void setAdrese(List<Adresa> adrese) {
        this.adrese = adrese;
    }

    public List<Adresa> getAdrese() {
        return adrese;
    }

    public void addAdresa(Adresa adresa){
        adrese.add(adresa);
    }

}
