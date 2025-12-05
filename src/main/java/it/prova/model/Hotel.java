package it.prova.model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String ragioneSociale;
    private int stelle;
    List<Stanza> stanze = new ArrayList<>();

    public Hotel(){}

    public Hotel(String ragioneSociale, int stelle, List<Stanza> stanze){
        this.ragioneSociale = ragioneSociale;
        this.stelle = stelle;
        this.stanze = stanze;
    }

    public String getRagioneSociale(){
        return this.ragioneSociale;
    }

    public int getStelle(){
        return this.stelle;
    }

    public List<Stanza> getStanze(){
        return this.stanze;
    }

    public void setRagioneSociale(String ragioneSociale){
        this.ragioneSociale = ragioneSociale;
    }

    public void setStelle(int Stelle){
        this.stelle = stelle;
    }

    public void setStanze(List<Stanza> stanze){
        this.stanze = stanze;
    }

    public int calcolaConto(Stanza input){
        int result = 0;
        for (Cliente c : input.getClienti()){
            result += c.sommaRealeDaPagare();
        }
        return result;
    }
}
