/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tp;

/**
 *
 * @author hp
 */
public class CompteCourant extends Compte {
    private double decouvertAutorise;

    public CompteCourant(double soldeInitial, double decouvertAutorise) {
        super(soldeInitial);
        this.decouvertAutorise = decouvertAutorise;
    }

    @Override
    public void retirer(double montant) {
        if (montant > 0 && solde + decouvertAutorise >= montant) {
            solde -= montant;
            System.out.println("CompteCourant #" + getNumero()
                + " : retrait de " + montant);
        } else {
            System.out.println("CompteCourant #" + getNumero()
                + " : retrait impossible (découvert max dépassé)");
        }
    }

    @Override
    public void afficherDetails() {
        System.out.println("CompteCourant #" + getNumero()
            + " — solde = " + solde
            + ", découvert autorisé = " + decouvertAutorise);
    }
}
