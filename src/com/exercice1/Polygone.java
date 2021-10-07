package com.exercice1;

import java.util.Random;

public class Polygone {

    private Integer nbDeCotes;
    private Integer longueurCote;
    private Integer perimetre;

    public Polygone() {
    }

    public Polygone(Integer nbDeCotes, Integer longueurCote) {
        this.nbDeCotes = nbDeCotes;
        this.longueurCote = longueurCote;
        this.perim();
    }

    public Integer getNbDeCotes() {
        return nbDeCotes;
    }

    public void setNbDeCotes(Integer nbDeCotes) {
        this.nbDeCotes = nbDeCotes;
    }

    public Integer getLongueurCote() {
        return longueurCote;
    }

    public void setLongueurCote(Integer longueurCote) {
        this.longueurCote = longueurCote;
    }

    public Integer getPerimetre() {
        return perimetre;
    }

    public void setPerimetre(Integer perimetre) {
        this.perimetre = perimetre;
    }

    @Override
    public String toString() {
        return "Polygone{" +
                "nbDeCotes=" + nbDeCotes +
                ", longueurCote=" + longueurCote +
                ", perimetre=" + perimetre +
                '}';
    }

    /**
     * Calcul le permimètre d'un polygone et initialise la variable perimetre avec le resultat
     */
    public void perim() {
        this.setPerimetre(this.getLongueurCote()*this.getNbDeCotes());
    }

    /**
     * Crée un nouveau polygone en ajoutant/enlevant des côtés à un polygone déjà existant
     * @param nbDeCoteAModifier nombres de côtés devant être modifiés
     * @return un nouveau objet de type Polygone
     * @throws Exception cas où le nombre de côtés est inférieur à nbDeCoteAModifier
     */
    public Polygone presqueClone(Integer nbDeCoteAModifier) throws Exception {
        Polygone nouveauPolygone = new Polygone();
        Random rand = new Random();

        nouveauPolygone.setLongueurCote(this.getLongueurCote());

        if (rand.nextBoolean()) {
            if(nbDeCoteAModifier < this.getNbDeCotes()) {
                nouveauPolygone.setNbDeCotes(this.getNbDeCotes() - nbDeCoteAModifier);
            } else {
                throw new Exception("le nombre donné est supérieur au nombre de côtés existants");
            }
        } else {
            nouveauPolygone.setNbDeCotes(this.getNbDeCotes() + nbDeCoteAModifier);
        }

        nouveauPolygone.perim();

        return nouveauPolygone;
    }

    //

    /**
     * Compare deux polygones
     * @param polygoneAComparer polygone que l'on souhaite comparer
     * @return le polygone ayant le plus petit périmètre
     */
    public Polygone plusPetit(Polygone polygoneAComparer) {
        return this.getPerimetre() > polygoneAComparer.getPerimetre() ? polygoneAComparer : this;
    }
}
