package it.prova.model;

public class Turista extends Cliente{

    public Turista(String nome, String cognome, Stanza stanza) {
        super(nome, cognome, stanza);
    }

    @Override
    public int sommaRealeDaPagare() {
        return this.getStanza().getQuantoAPersona();
    }
}
