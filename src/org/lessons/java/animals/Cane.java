package org.lessons.java.animals;

public class Cane extends AbstractAnimale{
    private String razza;
    private String taglia;
    private boolean hasMicrochip;

    public Cane(String nome, String genere, float peso, String colore, String razza, String taglia, boolean hasMicrochip) {
        super(nome, genere, peso, colore);
        this.razza = razza;
        this.taglia = taglia;
        this.hasMicrochip = hasMicrochip;
    }
    
    public String getRazza() {
        return this.razza;
    }

    public void setRazza(String razza) {
        if (razza != null) {
            this.razza = razza;
        }
    }
    public String getTaglia() {
        return this.taglia;
    }

    public void setTaglia(String taglia) {
        if (razza != null) {
            this.taglia = taglia;
        }
    }
    public boolean getHasMicrochip() {
        return this.hasMicrochip;
    }

    public void setHasMicrochip(boolean hasMicrochip) {
        this.hasMicrochip = hasMicrochip;
    }

    @Override
    public void verso() {
        System.out.println("Bau-Bau!");
    }
    
    @Override
    public void mangia() {
        System.out.println("Mangia carne e verdura");
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Il cane è di razza %s e di taglia %s. È presente il microchip: %b.", this.razza, this.taglia, this.hasMicrochip);
    }

}
