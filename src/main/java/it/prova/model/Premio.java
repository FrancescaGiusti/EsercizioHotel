package it.prova.model;

public class Premio extends Cliente{
    public Premio(String nome, String cognome, Stanza stanza) {
        super(nome, cognome, stanza);
    }

    @Override
    public int sommaRealeDaPagare() {
        return 0;
    }
}
