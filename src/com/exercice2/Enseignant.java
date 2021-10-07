package com.exercice2;

import java.util.Date;

public class Enseignant {

    private String nom;
    private Integer nbHeuresTotal;

    public Enseignant() {

    }

    public Enseignant(String nom, Integer nbHeuresTotal) {
        this.nom = nom;
        this.nbHeuresTotal = nbHeuresTotal;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getNbHeuresTotal() {
        return nbHeuresTotal;
    }

    public void setNbHeuresTotal(Integer nbHeuresTotal) {
        this.nbHeuresTotal = nbHeuresTotal;
    }

    /**
     * Affiche le nom de l'enseignant
     */
    public void nom() {
        System.out.println(this.getNom());
    }

    /***
     * Calcule le nombre d'heures complémentaires d'un enseignant
     * @return 0 si les 192h ne sont pas atteintes sinon retourne la différence avec le nombre d'heure total
     */
    public Integer heureComp() {
        return this.getNbHeuresTotal() <= 192 ? 0 : this.getNbHeuresTotal() - 192;
    }

    /**
     * Calcule la retribution d'un enseignant
     * @return le nombre d'heures complémentaires multiplié par 35€
     */
    public Integer retribution() {
        return this.heureComp() * 35;
    }
}
