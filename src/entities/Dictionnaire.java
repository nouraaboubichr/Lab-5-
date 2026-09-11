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


public class Dictionnaire extends Document {

    private String langue;

    public Dictionnaire(String titre, String langue) {
        super(titre);
        this.langue = langue;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public String toString() {
        return "Dictionnaire[numEnreg=" + numEnreg + ", titre=" + titre
                + ", langue=" + langue + "]";
    }
}
