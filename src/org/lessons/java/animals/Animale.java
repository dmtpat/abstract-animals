package org.lessons.java.animals;

public abstract class Animale {

    private String nome;
    private String genere;

    protected void Animals(String nome, String genere){
        this.nome = nome;
        this.genere = genere;
    }

    protected String getNome() {
        return this.nome;
    }

    protected void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        }
    }

    protected String getGenere() {
        return this.genere;
    }

    protected void setGenere(String genere) {
        if (genere != null) {
            this.genere = genere;
        }
    }

    protected void dormi() {
        System.out.println("zzz...");
    }

    public abstract void verso();
    public abstract void mangia();
}
