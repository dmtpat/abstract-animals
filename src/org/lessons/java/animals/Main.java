package org.lessons.java.animals;

public class Main {

    public static void faiNuotare(INuotante Animale) {
        Animale.nuota();
    }

    public static void faiVolare(IVolante Animale) {
        Animale.vola();
    }

    public static void main(String[] args) {
        Cane gina = new Cane("Gina", "canide", 7f, "nero", "meticcio", "piccola", true);
        Passerotto belfagor = new Passerotto("Belfagor", "volatile", 0.300f, "nero", 20f, false);
        Aquila pina = new Aquila("Pina", "volatile", 3f, "classico", 1000f, false, false);
        Delfino pinball = new Delfino("Pinball", "cetacceo", 4000f, "grigio", "collo di bottiglia", true);

        System.out.println("--------------------------------------------------------------------------------------------------");
        gina.verso();
        System.out.println(gina);
        gina.dormi();
        System.out.println("--------------------------------------------------------------------------------------------------");
        belfagor.verso();
        System.out.println(belfagor);
        faiVolare(belfagor);
        belfagor.dormi();
        System.out.println("--------------------------------------------------------------------------------------------------");
        pina.verso();
        System.out.println(pina);
        faiVolare(pina);
        pina.dormi();
        System.out.println("--------------------------------------------------------------------------------------------------");
        pinball.verso();
        System.out.println(pinball);
        pinball.dormi();
        faiNuotare(pinball);
        System.out.println("--------------------------------------------------------------------------------------------------");
        
    }
}
