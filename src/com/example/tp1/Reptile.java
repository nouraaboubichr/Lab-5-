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
public class Reptile extends Animal {
    private String typeEcailles;

    public Reptile(String nom, int age, String typeEcailles) {
        super(nom, age);
        this.typeEcailles = typeEcailles;
    }

    public void seChauffer() {
        System.out.println(nom + " se chauffe au soleil.");
    }

    @Override
    public String toString() {
        return super.toString() +
               " {Reptile, écailles=" + typeEcailles + "}";
    }
}
