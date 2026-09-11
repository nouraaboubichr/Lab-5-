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

public class Roman extends Livre {

    private double prix;

    public Roman(String titre, String auteur, int nbrPages, double prix) {
        super(titre, auteur, nbrPages);
        this.prix = prix;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String toString() {
        return "Roman[numEnreg=" + numEnreg + ", titre=" + titre
                + ", auteur=" + auteur + ", nbrPages=" + nbrPages
                + ", prix=" + prix + "]";
    }
}
