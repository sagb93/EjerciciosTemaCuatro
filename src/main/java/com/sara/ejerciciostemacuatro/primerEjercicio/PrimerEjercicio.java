/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sara.ejerciciostemacuatro.primerEjercicio;

public class PrimerEjercicio {
    
    public void execute(int a){
        if(a > 0){
            System.out.println(String.format("%d es positivo", a));
            return;
        }
        if(a < 0){
            System.out.println(String.format("%d es negativo", a));
            return;
        }
        if(a == 0){
            System.out.println(String.format("Cero"));
        }
    }    
}
