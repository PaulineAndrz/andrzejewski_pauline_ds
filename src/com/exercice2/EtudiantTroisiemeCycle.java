package com.exercice2;

public class EtudiantTroisiemeCycle extends Enseignant {

    public EtudiantTroisiemeCycle() {
    }

    public EtudiantTroisiemeCycle(String nom, Integer nbHeuresTotal) {
        super(nom, nbHeuresTotal);
    }

    /**
     * Calcule le nombre d'heures complémentaires d'un enseignant
     * @return 96 si le nombre d'heures max est atteint sinon, sinon retourne le nombre total d'heures
     */
    @Override
    public Integer heureComp() {
        return this.getNbHeuresTotal() >= 96 ? 96 : this.getNbHeuresTotal();
    }
}
