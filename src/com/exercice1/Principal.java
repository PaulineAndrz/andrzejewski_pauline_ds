package com.exercice1;

import com.exercice0.Utils;

public class Principal {

    public static void main(String[] args) throws Exception {

        // Instanciation de 2 polygones
        Polygone polygone1 = new Polygone(5, 4);
        Polygone polygone2 = new Polygone(7, 8);

        // Test des accesseurs
        polygone1.setLongueurCote(5);
        System.out.println(polygone1.getLongueurCote());
        polygone1.setNbDeCotes(6);
        System.out.println(polygone1.getNbDeCotes());
        polygone1.perim();

        polygone2.setLongueurCote(7);
        System.out.println(polygone2.getLongueurCote());
        polygone2.setNbDeCotes(8);
        System.out.println(polygone2.getNbDeCotes());
        polygone1.perim();

        // Affiche les caractèristiques de chaque instance de Polygone
        System.out.println("polygone 1 : " + polygone1.toString());
        System.out.println("polygone 2 : " + polygone2.toString());

        // Création d'un "presque" clone de polygone 1 avec 2 côtés en moins/plus
        Polygone polygoneClone = polygone1.presqueClone(2);
        System.out.println("polygoneClone : " + polygoneClone);

        // Affiche le polygone le plus petit entre polygone 1 et polygone 2
        System.out.println("polygone le plus petit : " + polygone1.plusPetit(polygone2));
        System.out.println("polygone le plus petit : " + polygone2.plusPetit(polygone1));
    }
}
