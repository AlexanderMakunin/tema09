package com.alexandermakunin.ejercicio3;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        Pila pila = new Pila(new ArrayList<>());
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            pila.push(random.nextInt(0,51));
        }
        System.out.println("sout 1: "+pila);
        for (int i = 0; i < 5; i++) {
            System.out.println("pop "+ i + ": " + pila.pop());
        }
        System.out.println("sout ultimo: " + pila);
    }
}
