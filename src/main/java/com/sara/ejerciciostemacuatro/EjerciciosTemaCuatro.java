/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.sara.ejerciciostemacuatro;

import com.sara.ejerciciostemacuatro.cuartoEjercicio.CuartoEjercicio;
import com.sara.ejerciciostemacuatro.primerEjercicio.PrimerEjercicio;
import com.sara.ejerciciostemacuatro.quintoEjercicio.QuintoEjercicio;
import com.sara.ejerciciostemacuatro.segundoEjercicio.SegundoEjercicio;
import com.sara.ejerciciostemacuatro.tercerEjercicio.TercerEjercicio;

/**
 *
 * @author NAZARETH
 */
public class EjerciciosTemaCuatro {

    public static void main(String[] args){

        executePrimerEjercicio(-5);

        System.out.println("********************************************");

        executeSegundoEjercicio(3);

        System.out.println("********************************************");

        executeTercerEjercicio(7);

        System.out.println("********************************************");

        executeCuartoEjercicio();

        System.out.println("********************************************");

        executeQuintoEjercicio("estacdasdio");
    }

    public static void executePrimerEjercicio(int numero){
        PrimerEjercicio primerEjercicio = new PrimerEjercicio();
        primerEjercicio.execute(numero);
    }

    public static void executeSegundoEjercicio(int numero){
        SegundoEjercicio segundoEjercicio = new SegundoEjercicio();
        segundoEjercicio.execute(numero);
    }

    public static void executeTercerEjercicio(int numero){
        TercerEjercicio tercerEjercicio = new TercerEjercicio();
        tercerEjercicio.execute(numero);
    }

    public static void executeCuartoEjercicio(){
        CuartoEjercicio cuartoEjercicio = new CuartoEjercicio();
        cuartoEjercicio.execute();
    }

    public static void executeQuintoEjercicio(String estacion){
        QuintoEjercicio quintoEjercicio = new QuintoEjercicio();
        quintoEjercicio.execute(estacion);
    }
}
