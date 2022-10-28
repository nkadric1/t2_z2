package org.example;

public class Racun {
    protected
    Long brojRacuna;
    Osoba korisnikRacuna;
    boolean odobrenjePrekoracenja;
    Double stanjeRacuna;


   private boolean provjeriOdobrenjePrekoracenja(Double t){return true;}

    public Racun(Long t, Osoba o) {}



    boolean izvrsiUplatu(Double uplata){return true;}
    boolean izvrsiIsplatu(Double isplata){ return true;}
    void odobriPrekoracenje(Double x){}
};
