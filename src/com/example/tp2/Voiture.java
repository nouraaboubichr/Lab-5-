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


public class Voiture extends Motorise {

    private int nbPortes;

    public Voiture(String modele, Moteur moteur, double carburant, int nbPortes) {
        super(modele, moteur, carburant);
        this.nbPortes = nbPortes;
    }

    public int getNbPortes() {
        return nbPortes;
    }

    public void klaxonner() {
        System.out.println(modele + " klaxonne : Pouet !");
    }

    public String toString() {
        return super.toString() + " {Voiture, portes=" + nbPortes + "}";
    }
}