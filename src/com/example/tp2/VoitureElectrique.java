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


public class VoitureElectrique extends Motorise {

    public VoitureElectrique(String modele, Moteur moteur, double batterieInitial) {
        super(modele, moteur, batterieInitial);
    }

    public void refuel(double kWh) {
        niveauCarburant = niveauCarburant + kWh;
        System.out.println(modele + " recharge " + kWh + " kWh (niveau=" + niveauCarburant + ")");
    }

    public String toString() {
        String s = super.toString();
        s = s.replace("carburant", "batterie");
        return s + " {Electrique}";
    }
}

