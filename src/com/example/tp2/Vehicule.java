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

public class Vehicule {

    private static int compteur = 0;
    protected int id;
    protected String modele;

    public Vehicule(String modele) {
        compteur++;
        id = compteur;
        this.modele = modele;
    }

    public int getId() {
        return id;
    }

    public String getModele() {
        return modele;
    }

    public String toString() {
        return "Vehicule#" + id + " [" + modele + "]";
    }
}
