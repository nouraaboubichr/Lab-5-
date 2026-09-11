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

public class Manuel extends Livre {
    private String niveau;

    public Manuel(String titre, String auteur, int nbrPages, String niveau) {
        super(titre, auteur, nbrPages);
        this.niveau = niveau;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    @Override
    public String toString() {
        return "Manuel [numEnreg=" + numEnreg + ", titre=" + titre
                + ", auteur=" + auteur + ", nbrPages=" + nbrPages
                + ", niveau=" + niveau + "]";
    }
}
