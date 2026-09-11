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
public class CompteEpargne extends Compte {
     private double tauxInteret; 

    public CompteEpargne(double soldeInitial, double tauxInteret) {
        super(soldeInitial);
        this.tauxInteret = tauxInteret;
    }

    public void appliquerInterets() {
        double interets = solde * tauxInteret / 100.0;
        solde += interets;
        System.out.println("CompteEpargne #" + getNumero()
            + " : intérêts de " + interets);
    }

    @Override
    public void afficherDetails() {
        System.out.println("CompteEpargne #" + getNumero()
            + " — solde = " + solde
            + ", taux = " + tauxInteret + "%");
    }
}
