package com.alexandermakunin;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio8 {
    private static Scanner scanner = new Scanner(System.in);
    private static HashMap<String,String> palabras = new HashMap<>();
    public static void main(String[] args) {
        int seleccion;
        do {
            System.out.println("***********************\n" +
                    "* GESTIÓN DICCIONARIO *\n" +
                    "***********************\n" +
                    "1. Añadir palabra\n" +
                    "2. Modificar palabra\n" +
                    "3. Eliminar palabra\n" +
                    "4. Consultar palabra\n" +
                    "5. Mostrar diccionario\n" +
                    "---------------------\n" +
                    "0. Salir\n");
            seleccion = scanner.nextInt();
            switch (seleccion) {
                case 1 -> anyadirPalabra();
                case 2 -> cambiarPalabra();
                case 3 -> eliminarPalabra();
                case 4 -> consultarPalabra();
                case 5 -> mostrarDiccionario();
            }
        } while (seleccion != 0);
    }
    private static void anyadirPalabra() {
        System.out.println("Indique la palabra");
        String palabra = scanner.next();
        System.out.println("Indique el significado");
        String significado = scanner.next();
        palabras.put(palabra, significado);
        System.out.println("Palabra añadida");
    }

    private static void cambiarPalabra() {
        System.out.println("Indique la palabra");
        String palabra = scanner.next();
        palabras.get(palabra);
        System.out.println("Indique el significado");
        String significado = scanner.next();
        palabras.replace(palabra,significado);
        System.out.println("Palabra cambiada");
    }
    private static void eliminarPalabra() {
        System.out.println("Indique la palabra");
        String palabra = scanner.next();
        palabras.get(palabra);
        palabras.remove(palabra);
        System.out.println("Palabra eliminada");
    }
    private static void consultarPalabra() {
        System.out.println("Indique la palabra");
        String palabra = scanner.next();
        palabras.get(palabra);
        System.out.println(palabras.get(palabra));
    }
    private static void mostrarDiccionario() {
        System.out.println("palabras: ");
        for (String palabra : palabras.keySet()) {
            System.out.println(palabra);
        }
    }
}
