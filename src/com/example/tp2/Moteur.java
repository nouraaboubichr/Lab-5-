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


public class Moteur {

    private String type;
    private int puissance;

    public Moteur(String type, int puissance) {
        this.type = type;
        this.puissance = puissance;
    }

    public String getType() {
        return type;
    }

    public int getPuissance() {
        return puissance;
    }

    public String toString() {
        return type + " " + puissance + "ch";
    }
}