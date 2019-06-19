package ba.unsa.etf.rs.priprema;

import java.beans.XMLEncoder;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Kviz kviz = new Kviz("Milijunaš");
        Pitanje pitanje = new Pitanje("Koji je gčavni grad Jamajke?");
        ArrayList<String> odgovori = new ArrayList<String>();
        odgovori.add("Sarajevo");
        odgovori.add("Kingston");
        odgovori.add("Zenica");
        odgovori.add("Tarčin");
        odgovori.add("Banja Luka");
        pitanje.setOdgovori(odgovori);
        pitanje.setIndexTacnog(1);
        ArrayList<Pitanje> pitanja = new ArrayList<Pitanje>();
        pitanja.add(pitanje);
        kviz.setPitanja(pitanja);

        XMLEncoder encoder=null;
        try{
            encoder=new XMLEncoder(new BufferedOutputStream(new FileOutputStream("kviz.xml")));
        }catch(FileNotFoundException fileNotFound){
            System.out.println("ERROR: While Creating or Opening the File dvd.xml");
        }
        encoder.writeObject(kviz);
        encoder.close();

        System.out.println(kviz);
    }
}
