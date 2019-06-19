package ba.unsa.etf.rs.priprema;

import java.io.Serializable;
import java.util.ArrayList;

public class Kviz implements Serializable {
    String naziv;
    ArrayList<Pitanje> pitanja;

    public Kviz() {
    }

    public Kviz(String naziv) {
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public ArrayList<Pitanje> getPitanja() {
        return pitanja;
    }

    public void setPitanja(ArrayList<Pitanje> pitanja) {
        this.pitanja = pitanja;
    }

    @Override
    public String toString() {
        return naziv+" : \n"+pitanja;
    }
}
