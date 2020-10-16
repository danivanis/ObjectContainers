package ro.siit.constructors;

import java.util.*;

public class App {

    public static void main(String[] args) {

        Persoana persoana1 = new Persoana("Ion", 32);
        Persoana persoana2 = new Persoana("Gheorghe", 32);
        Persoana persoana3 = new Persoana("Mihai",25);

        Hobby pescuit = new Hobby("Pescuit",1);
        Hobby schi = new Hobby("Schi",2);
        Hobby citit = new Hobby("Citit", 3);

        Tara romania = new Tara("Romania");
        Tara germania = new Tara("Germania");
        Tara austria = new Tara("Austria");

        Adresa adresa1 = new Adresa("Calea Baltilor", romania);
        Adresa adresa2 = new Adresa("Hochmeyerstrasse", germania);
        Adresa adresa3 = new Adresa("Bildeburgen", austria);

        persoana1.adaugareHobby(pescuit);
        persoana2.adaugareHobby(citit);
        persoana3.adaugareHobby(schi);

        pescuit.addAdresa(adresa1);
        schi.addAdresa(adresa3);
        citit.addAdresa(adresa2);

        Map<Persoana, List<Hobby>> hobbyPersoane = new HashMap<>();
        hobbyPersoane.put(persoana1, persoana1.getHobbies());
        hobbyPersoane.put(persoana2, persoana2.getHobbies());
        hobbyPersoane.put(persoana3, persoana3.getHobbies());

        displayHobbyDetails(hobbyPersoane, persoana1);
        displayHobbyDetails(hobbyPersoane, persoana2);
        displayHobbyDetails(hobbyPersoane, persoana3);

        Set<Persoana> varstaPersoana = new TreeSet<>(new ComparatorPersoanaDupaVarsta());
        varstaPersoana.add(new Persoana("Liliana", 21));
        varstaPersoana.add(new Angajat("Adriana", 33));
        varstaPersoana.add(new Somer("Elena", 35));
        for (Persoana persoana: varstaPersoana){
            System.out.println("Persoana" + persoana.getName() + " are " + persoana.getAge() + " ani!");
        }

        Set<Persoana> numePersoana = new TreeSet<>(new ComparatorPersoanaDupaNume());
        numePersoana.add(new Persoana("Marian", 18));
        numePersoana.add(new Angajat("Filip", 38));
        numePersoana.add(new Somer("Vadim", 29));
        for (Persoana persoana: numePersoana){
            System.out.println("Persoana" + persoana.getName() + " are " + persoana.getAge() + " ani!");
        }

    }

    public static void displayHobbyDetails(Map<Persoana, List<Hobby>> hobbyPersoane, Persoana persoana){
        List<Hobby> hobbies = hobbyPersoane.get(persoana);
        for (Hobby hobby: hobbies) {
            Set<String> locatiiHobby = new HashSet<>();
            Set<String> countryName = new HashSet<>();
            List<Adresa> adrese = hobby.getAdrese();
            for (Adresa adresa: adrese){
                countryName.add(adresa.getTara().getCountryName());
                locatiiHobby.add(adresa.getLocatiiHobby());
            }
            for (String tara: countryName){
                System.out.println("Hobby-ul " + hobby.getHobbyName() + " se practica la " + locatiiHobby + " din tara " + tara);
            }
        }
    }

}
