package org.example;

import org.example.clasesHalloween.Fiesta;
import org.example.clasesHalloween.Invitado;
import org.example.clasesHalloween.Lugar;

import java.util.Scanner;

public class Main {
    


        public static void main(String[] args) {
            Scanner entradaPorTeclado = new Scanner(System.in);
            Invitado objetoInvitado = new Invitado();
            Lugar objetoLugar = new Lugar();
            Fiesta objetoFiesta = new Fiesta();

            System.out.println("FIESTA");
            System.out.println("1. gastos de comida: ");
            objetoFiesta.setCostosAlimentos(entradaPorTeclado.nextDouble());
            System.out.println("El costo de los alimentos fue" + objetoFiesta.getCostosAlimentos());

            System.out.println("1. gastos de las bebidas: ");
            objetoFiesta.setCostosBebidas(entradaPorTeclado.nextDouble());
            System.out.println("El costo de las bebidas fue" + objetoFiesta.getCostosBebidas());

            System.out.println("1. gastos de las lugar: ");
            objetoFiesta.setCostosLugar(entradaPorTeclado.nextDouble());
            System.out.println("El costo del lugar fue: " + objetoFiesta.getCostosLugar());

            System.out.println("1. gastos de los Equipos: ");
            objetoFiesta.setCostosEquipos(entradaPorTeclado.nextDouble());
            System.out.println("El costo de los Equipos fue: " + objetoFiesta.getCostosEquipos());
        }
    }