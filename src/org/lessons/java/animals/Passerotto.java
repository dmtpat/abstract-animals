package org.lessons.java.animals;

public class Passerotto extends Animale implements Volante{

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

    @Override
    public void verso(){
        System.out.println("Cip-Cip!");
    }

    @Override
    public void mangia() {
        System.out.println("Mangia insetti, cereali e verdura");

    }
    
    @Override
    public String toString() {
        return super.toString()
                + String.format("Il passerotto ha una ampiezza alare di %.2f cm. Ha l'anello di riconoscimento: %b.",
                        this.ampiezzaAlare, this.hasRing);
    }
    
    
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}
