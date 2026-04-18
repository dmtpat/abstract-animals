package org.lessons.java.animals;

public class Passerotto extends Animale {

    private float ampiezzaAlare;
    private boolean hasRing;

    public Passerotto(String nome, String genere, float peso, String colore, float ampiezzaAlare, boolean hasRing) {
        super(nome, genere, peso, colore);
        this.ampiezzaAlare = ampiezzaAlare;
        this.hasRing = hasRing;
    }

    public float getAmpiezzaAlare() {
        return this.ampiezzaAlare;
    }

    public void setAmpezzaAlare(float ampiezzaAlare) {
        if (ampiezzaAlare != 0) {
            this.ampiezzaAlare = ampiezzaAlare;
        }
    }

    public boolean getHasRing() {
        return this.hasRing;
    }

    public void setHasRing(boolean hasRing) {
        this.hasRing = hasRing;
    }

    public void verso(){
        System.out.println("Cip-Cip!");
    }

    public void mangia(){
        System.out.println("Mangia insetti, cereali e verdura");
    }
}
