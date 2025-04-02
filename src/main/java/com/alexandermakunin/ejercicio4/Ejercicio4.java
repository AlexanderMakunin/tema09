package com.alexandermakunin.ejercicio4;

import com.alexandermakunin.ejercicio3.Pila;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {
        Cola cola = new Cola(new ArrayList<>());
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            cola.add(random.nextInt(0,51));
        }
        System.out.println("sout 1: "+cola);
        for (int i = 0; i < 5; i++) {
            System.out.println("remove "+ i + ": " + cola.remove());
        }
        System.out.println("sout ultimo: " + cola);
    }
}
