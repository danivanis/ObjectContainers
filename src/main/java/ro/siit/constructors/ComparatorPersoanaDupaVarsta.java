package ro.siit.constructors;

import java.util.Comparator;

public class ComparatorPersoanaDupaVarsta implements Comparator<Persoana>{

    @Override
    public int compare(Persoana p1, Persoana p2){
        return p1.getAge().compareTo(p2.getAge());
    }

}
