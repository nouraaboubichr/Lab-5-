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
public class Oiseau extends Animal {
    private double envergure;

    public Oiseau(String nom, int age, double envergure) {
        super(nom, age);
        this.envergure = envergure;
    }

    public void voler() {
        System.out.println(nom + " s'envole avec une envergure de " 
                           + envergure + " m.");
    }

    @Override
    public String toString() {
        return super.toString() +
               " {Oiseau, envergure=" + envergure + "}";
    }
}
