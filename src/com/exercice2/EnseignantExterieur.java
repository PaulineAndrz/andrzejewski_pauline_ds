package com.exercice2;

public class EnseignantExterieur extends Enseignant {

    public EnseignantExterieur() {
    }

    public EnseignantExterieur(String nom, Integer nbHeuresTotal) {
        super(nom, nbHeuresTotal);
    }

    /**
     * Calcule le nombre d'heures complémentaires d'un enseignant
     * @return le nombre d'heures complémentaires correspondant au nombre d'heures total
     */
    @Override
    public Integer heureComp() {
        return this.getNbHeuresTotal();
    }
}
