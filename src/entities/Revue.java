/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author hp
 */

public class Revue extends Document {

    private String mois;
    private int annee;

    public Revue(String titre, String mois, int annee) {
        super(titre);
        this.mois = mois;
        this.annee = annee;
    }

    public String getMois() {
        return mois;
    }

    public void setMois(String mois) {
        this.mois = mois;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String toString() {
        return "Revue[numEnreg=" + numEnreg + ", titre=" + titre
                + ", mois=" + mois + ", annee=" + annee + "]";
    }
}