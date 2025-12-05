package it.prova.test;

import it.prova.model.*;

import java.util.ArrayList;
import java.util.List;

public class TestHotel {
    public static void main(String[] args){
        //Test per vedere quanto devono pagare le stanze al momento del checkout
        List<Stanza> stanzeHotel = new ArrayList<>();
        Hotel hotel = new Hotel("Grand Hotel Primavera", 5, stanzeHotel);
        List<Cliente> clientiStanza1 = new ArrayList<>();
        Stanza stanza1 = new Stanza(24, 50, hotel, clientiStanza1);
        Cliente c1 = new Turista("Mario", "Rossi", stanza1);
        clientiStanza1.add(c1);
        Cliente c2 = new Turista("Maria", "Rossi", stanza1);
        clientiStanza1.add(c2);
        stanzeHotel.add(stanza1);

        List<Cliente> clientiStanza2 = new ArrayList<>();
        Stanza stanza2 = new Stanza(50, 100, hotel, clientiStanza2);
        Cliente c3 = new Rappresentante("Carlo", "Verdi", stanza2);
        clientiStanza2.add(c3);
        stanzeHotel.add(stanza2);

        List<Cliente> clientiStanza3 = new ArrayList<>();
        Stanza stanza3 = new Stanza(10, 30, hotel, clientiStanza3);
        Cliente c4 = new Turista("Martina", "Bianchi", stanza3);
        Cliente c5 = new Turista("Michele", "Bianchi", stanza3);
        Cliente c6 = new Turista("Paolo", "Bianchi", stanza3);
        Cliente c7 = new Turista("Michela", "Asso", stanza3);
        clientiStanza3.add(c4);
        clientiStanza3.add(c5);
        clientiStanza3.add(c6);
        clientiStanza3.add(c7);
        stanzeHotel.add(stanza3);

        List<Cliente> clientiStanza4 = new ArrayList<>();
        Stanza stanza4 = new Stanza(22, 90, hotel, clientiStanza4);
        Cliente c8 = new Premio("Roberto", "Neri", stanza4);
        clientiStanza4.add(c8);
        stanzeHotel.add(stanza4);

        int risultatoStanza1 = hotel.calcolaConto(stanza1);
        System.out.println("la staza 1 paga: " + risultatoStanza1);
        int risultatoStanza2 = hotel.calcolaConto(stanza2);
        System.out.println("la staza 2 paga: " + risultatoStanza2);
        int risultatoStanza3 = hotel.calcolaConto(stanza3);
        System.out.println("la staza 3 paga: " + risultatoStanza3);
        int risultatoStanza4 = hotel.calcolaConto(stanza4);
        System.out.println("la staza 4 paga: " + risultatoStanza4);
    }
}
