package ba.unsa.etf.rs.priprema;

import java.io.Serializable;
import java.util.ArrayList;

public class Pitanje implements Serializable {
    String tekst;
    ArrayList<String> odgovori;
    int indexTacnog;

    public Pitanje() {
    }

    public Pitanje(String tekst) {
        this.tekst = tekst;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public ArrayList<String> getOdgovori() {
        return odgovori;
    }

    public void setOdgovori(ArrayList<String> odgovori) {
        this.odgovori = odgovori;
    }

    public int getIndexTacnog() {
        return indexTacnog;
    }

    public void setIndexTacnog(int indexTacnog) {
        this.indexTacnog = indexTacnog;
    }

    @Override
    public String toString() {
        return tekst + ": \n"+odgovori;
    }

}
