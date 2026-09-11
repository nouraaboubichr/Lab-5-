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


public class Moto extends Motorise {

    private double cylindree;

    public Moto(String modele, Moteur moteur, double carburant, double cylindree) {
        super(modele, moteur, carburant);
        this.cylindree = cylindree;
    }

    public double getCylindree() {
        return cylindree;
    }

    public void faireWheelie() {
        System.out.println(modele + " fait un wheelie !");
    }

    public String toString() {
        return super.toString() + " {Moto, cylindree=" + cylindree + " cm3}";
    }
}