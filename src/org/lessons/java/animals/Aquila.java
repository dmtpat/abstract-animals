package org.lessons.java.animals;

public class Aquila extends Animale {
    
    private float ampiezzaAlare;
    private boolean hasRing;
    private boolean hasNest;

    public Aquila(String nome, String genere, float peso, String colore, float ampiezzaAlare, boolean hasRing,
            boolean hasNest) {
        super(nome, genere, peso, colore);
        this.ampiezzaAlare = ampiezzaAlare;
        this.hasRing = hasRing;
        this.hasNest = hasNest;
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

    public boolean getHasNest() {
        return this.hasNest;
    }

    public void setHasNest(boolean hasNest) {
        this.hasNest = hasNest;
    }

    public void verso(){
        System.out.println("kiii-kiii!");
    }

    public void mangia(){
        System.out.println("Mangia insetti, carne, cereali e verdura");
    }

}
