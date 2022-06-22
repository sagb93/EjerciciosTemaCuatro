/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sara.ejerciciostemacuatro.quintoEjercicio;

public class QuintoEjercicio {

    public void execute(String estacion) {

        switch (estacion) {
            case "verano":
                System.out.println("Es Verano");
                break;
            case "invierno":
                System.out.println("Es Invierno");
                break;
            case "otonio":
                System.out.println("Es Otonio");
                break;
            case "primavera":
                System.out.println("Es Primavera");
                break;
            default:
                System.out.println("Ingrese una estacion correcta");
        }
    }
}
