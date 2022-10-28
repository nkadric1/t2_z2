package org.example;

public class Osoba {
    private String ime, prezime;
    public Osoba(String i, String p){
        ime=i;
        prezime=p;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                '}';
    }
};
