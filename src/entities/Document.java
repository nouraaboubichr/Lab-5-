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

public class Document {

    private static int compteur = 0;
    protected int numEnreg;
    protected String titre;

    public Document(String titre) {
        compteur++;
        this.numEnreg = compteur;
        this.titre = titre;
    }

    public int getNumEnreg() {
        return numEnreg;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return null;
    }

    public String toString() {
        return "Document[numEnreg=" + numEnreg + ", titre=" + titre + "]";
    }
}
