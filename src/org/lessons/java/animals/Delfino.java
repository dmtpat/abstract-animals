package org.lessons.java.animals;

public class Delfino extends AbstractAnimale implements INuotante{
    private String razza;
    private boolean isSaltyWater;

    public Delfino(String nome, String genere, float peso, String colore, String razza, boolean isSaltyWater) {
        super(nome, genere, peso, colore);
        this.razza = razza;
        this.isSaltyWater = isSaltyWater;
    }
    
    public String getRazza() {
        return this.razza;
    }

    public void setRazza(String razza) {
        if (razza != null) {
            this.razza = razza;
        }
    }

    public boolean getIsSaltyWater() {
        return this.isSaltyWater;
    }

    public void setIsSaltyWater(boolean isSaltyWater) {
        this.isSaltyWater = isSaltyWater;
    }

    @Override
    public void verso() {
        System.out.println("iii iii!");
    }

    @Override
    public void mangia() {
        System.out.println("Mangia pesce e alghe");
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format("Il delfino è di razza %s e vive in acqua salata: %b.", this.razza, this.isSaltyWater);
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }
}
