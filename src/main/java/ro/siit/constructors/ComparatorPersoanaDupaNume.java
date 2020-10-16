package ro.siit.constructors;

import java.util.Comparator;

public class ComparatorPersoanaDupaNume implements Comparator<Persoana> {

    public int compare(Persoana p1, Persoana p2){
        return p1.getName().compareTo(p2.getName());
    }

}
