package org.lessons.java.animals;

public class Cane extends Animale{
    private String razza;
    private String taglia;
    private boolean hasMicrochip;
    private String colore;

    public Cane(String nome, String genere, String razza, String taglia, boolean hasMicrochip, String colore) {
        super(nome, genere);
        this.razza = razza;
        this.taglia = taglia;
        this.hasMicrochip = hasMicrochip;
        this.colore = colore;
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
        if (razza != null) {
            this.hasMicrochip = hasMicrochip;
        }
    }
    public String getColore() {
        return this.colore;
    }

    public void setColore(String colore) {
        if (razza != null) {
            this.colore = colore;
        }
    }
    
    public void verso(){
        System.out.println("Bau-Bau!");
    }

    public void mangia(){
        System.out.println("Mangia carne e verdura");
    }


}
