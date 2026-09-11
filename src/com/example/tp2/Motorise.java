/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tp2;

/**
 *
 * @author hp
 */

public class Motorise extends Vehicule {

    protected Moteur moteur;
    protected double niveauCarburant;
    protected double kmTotal;

    public Motorise(String modele, Moteur moteur, double carburantInitial) {
        super(modele);
        this.moteur = moteur;
        this.niveauCarburant = carburantInitial;
        this.kmTotal = 0;
    }

    public double getKmTotal() {
        return kmTotal;
    }

    public double getNiveauCarburant() {
        return niveauCarburant;
    }

    public void demarrer() {
        System.out.println(toString() + " demarre avec " + niveauCarburant + " unites et moteur " + moteur);
    }

    public void rouler(double km) {
        double conso = km * 0.1;

        if (niveauCarburant >= conso) {
            niveauCarburant = niveauCarburant - conso;
            kmTotal = kmTotal + km;
            System.out.println(modele + " a roule " + km + " km, reste " + niveauCarburant + " unites");
        } else {
            System.out.println("Carburant insuffisant pour " + km + " km sur " + modele + " (reste : " + niveauCarburant + " unites)");
        }
    }

    public void refuel(double quantite) {
        niveauCarburant = niveauCarburant + quantite;
        System.out.println(modele + " ravitaille de " + quantite + " unites (nouveau niveau : " + niveauCarburant + ")");
    }

    public String toString() {
        return super.toString() + " {" + moteur + ", carburant=" + niveauCarburant + "}";
    }
}