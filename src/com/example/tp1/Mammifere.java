/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tp1;

/**
 *
 * @author hp
 */
public class Mammifere extends Animal {
    private String couleurFourrure;

    public Mammifere(String nom, int age, String couleurFourrure) {
        super(nom, age);
        this.couleurFourrure = couleurFourrure;
    }

    public void allaiter() {
        System.out.println(nom + " allaite ses petits.");
    }

    @Override
    public String toString() {
        return super.toString() +
               " {Mammifere, fourrure=" + couleurFourrure + "}";
    }
}