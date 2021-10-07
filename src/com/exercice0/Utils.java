package com.exercice0;

public class Utils {

    /**
     * convertit les kilomètres en miles
     * @param km nombre de km renseigné
     * @return la valeur des km convertie en miles
     */
    public static double km_vers_mile(double km) {
        return km/1.609;
    }

    /***
     * retourne le plus grand commun diviseur (pgcd) de deux nombres entiers positifs
     * @param a premier nombre renseigné
     * @param b deuxième nombre renseigné
     * @return le plus grand commun diviseur de a et b
     */
    public static int pgcd(int a, int b) {
        while (a != b) {
            if(a > b)
                a -= b;
            else
                b -= a;
        }
        return b;
    }

    /**
     * calcule la somme des nombres premiers
     * @param n nombre renseigné
     * @return la somme des nombres premiers
     */
    public static int sumNprem(int n) {
        return n * (n + 1) / 2;
    }

}
