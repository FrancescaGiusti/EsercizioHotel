package it.prova.model;

public abstract class Cliente {
    protected String nome;
    protected String cognome;
    protected Stanza stanza;

    public Cliente(){}

    public Cliente(String nome, String cognome, Stanza stanza){
        this.nome = nome;
        this.cognome = cognome;
        this.stanza = stanza;
    }

    public Stanza getStanza(){
        return this.stanza;
    }

    public String getCognome(){
        return this.cognome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCognome(String cognome){
        this.cognome = cognome;
    }

    public void setStanza(Stanza stanza){
        this.stanza = stanza;
    }

    public abstract int sommaRealeDaPagare();

    @Override
    public String toString(){
        return this.nome + " " + this.cognome + ", stanza " + this.stanza;
    }
}
