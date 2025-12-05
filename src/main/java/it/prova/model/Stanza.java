package it.prova.model;

import java.util.ArrayList;
import java.util.List;

public class Stanza {
    private int numeroStanza;
    private int quantoAPersona;
    private Hotel hotel;
    List<Cliente> clienti = new ArrayList<>();

    public Stanza(){}

    public Stanza(int numeroStanza, int quantoAPersona, Hotel hotel, List<Cliente> clienti){
        this.numeroStanza = numeroStanza;
        this.quantoAPersona = quantoAPersona;
        this.hotel = hotel;
        this.clienti = clienti;
    }

    public int getNumeroStanza(){
        return this.numeroStanza;
    }

    public int getQuantoAPersona(){
        return this.quantoAPersona;
    }

    public List<Cliente> getClienti() {
        return clienti;
    }

    public void setClienti(List<Cliente> clienti) {
        this.clienti = clienti;
    }

    public Hotel getHotel(){
        return this.hotel;
    }

    public void setNumeroStanza(int numeroStanza){
        this.numeroStanza = numeroStanza;
    }

    public void setQuantoAPersona (int quantoAPersona){
        this.quantoAPersona = quantoAPersona;
    }

    public void setHotel (Hotel hotel){
        this.hotel = hotel;
    }

    @Override
    public String toString(){
        return "n." + this.numeroStanza + ", hotel " + this.hotel + ", prezzo a persona: " + this.quantoAPersona + " euro";
    }
}
