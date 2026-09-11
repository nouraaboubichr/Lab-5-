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

public class Camion extends Motorise {

    private double capaciteCharge;

    public Camion(String modele, Moteur moteur, double carburant, double capaciteCharge) {
        super(modele, moteur, carburant);
        this.capaciteCharge = capaciteCharge;
    }

    public double getCapaciteCharge() {
        return capaciteCharge;
    }

    public void charger(double poids) {
        System.out.println(modele + " charge " + poids + " t (max " + capaciteCharge + " t)");
    }

    public String toString() {
        return super.toString() + " {Camion, cap=" + capaciteCharge + " t}";
    }
}