package com.alexandermakunin.ejercicio2;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                doubleArrayList.add(10.0);
                doubleArrayList.add(10.0);
                doubleArrayList.add(10.0);
            }
            doubleArrayList.add(random.nextDouble(0,51));
        }

        for (double num : doubleArrayList) {
            System.out.println(num);
        }
        System.out.println("TEST");
        ArrayListEstadisticas arrayListEstadisticas = new ArrayListEstadisticas(doubleArrayList);
        System.out.println(arrayListEstadisticas.minimo());
        System.out.println(arrayListEstadisticas.maximo());
        System.out.println(arrayListEstadisticas.sumatorio());
        System.out.println(arrayListEstadisticas.media());
        System.out.println(arrayListEstadisticas.moda());
    }
}
