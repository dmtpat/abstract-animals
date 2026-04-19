package org.lessons.java.animals;

public abstract class Animale {

    private String nome;
    private String genere;
    private float peso;
    private String colore;

    protected Animale(String nome, String genere, float peso, String colore){
        this.nome = nome;
        this.genere = genere;
        this.peso = peso;
        this.colore = colore;
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

    protected float getPeso() {
        return this.peso;
    }

    protected void setpeso(float peso) {
        if (peso != 0) {
            this.peso = peso;
        }
    }

    protected String getColore() {
        return this.colore;
    }

    protected void setColore(String colore) {
        if (colore != null) {
            this.colore = colore;
        }
    }

    protected void dormi() {
        System.out.println("zzz...");
    }

    public abstract void verso();

    public abstract void mangia();
    
    public String toString() {
        return String.format("L'animale si chiama %s è del genere %s, pesa %.2f Kg e il suo colore è %s. %n", this.nome, this.genere, this.peso, this.colore);
    }
}
