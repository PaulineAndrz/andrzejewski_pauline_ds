package com.exercice2;

import com.exercice0.Utils;

public class Main {

    public static void main(String[] args) {
        // Instanciation des enseignants
        EnseignantExterieur ee1 = new EnseignantExterieur("Gandalf", 200);
        EnseignantFac ef1 = new EnseignantFac("Professeur Xavier", 350);
        EtudiantTroisiemeCycle etc1 = new EtudiantTroisiemeCycle("Popote", 1000);

        // Appel aux méthodes
        ee1.nom();
        System.out.println(ee1.heureComp()+"h");
        System.out.println(ee1.retribution()+"€");

        ef1.nom();
        System.out.println(ef1.heureComp()+"h");
        System.out.println(ef1.retribution()+"€");

        etc1.nom();
        System.out.println(etc1.heureComp()+"h");
        System.out.println(etc1.retribution()+"€");
    }
}
