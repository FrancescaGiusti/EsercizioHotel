package it.prova.model;

public class Rappresentante extends Cliente{

    public Rappresentante(String nome, String cognome, Stanza stanza) {
        super(nome, cognome, stanza);
    }

    @Override
    public int sommaRealeDaPagare() {
        int scontoDaApplicare = (this.getStanza().getQuantoAPersona() * 20)/100;
        return this.getStanza().getQuantoAPersona() - scontoDaApplicare;
    }
}
