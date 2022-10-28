package org.example;

import java.util.List;

public class Banka {
  private  Long brojRacuna;
    List<Korisnik> korisnici;
    List<Uposlenik> uposlenici;
  public Banka(){}
    Korisnik kreirajNovogKorisnika(String s1, String s2){return new Korisnik(s1,s2);}
    Uposlenik kreirajNovogUposlenika(String u1, String u2){return new Uposlenik(u1,u2);}
    Racun kreirajRacunZaKorisnika(Korisnik k){  return new Racun(0L, kreirajNovogKorisnika(k.toString(), k.toString()));
  }

};
