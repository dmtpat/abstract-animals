package org.lessons.java.animals;

public class Aquila extends Animale implements Volante {
    
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

    @Override
    public void verso() {
        System.out.println("kiii-kiii!");
    }

    @Override
    public void mangia() {
        System.out.println("Mangia insetti, carne, cereali e verdura");
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format(
                "Il passerotto ha una ampiezza alare di %.2f cm. Ha l'anello di riconoscimento: %b. Ha una nidiata: %b.",
                this.ampiezzaAlare, this.hasRing, this.hasNest);
    }

     public void vola() {
        System.out.println("Sto volando!!!");
    }
}
