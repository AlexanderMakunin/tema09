package com.alexandermakunin;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio9 {
    private static Scanner scanner = new Scanner(System.in);
    private static HashMap<String,String> palabras = new HashMap<>();
    private static HashMap<String,Integer> usuarios = new HashMap<>();
    public static void main(String[] args) {
        int seleccion;
        do {
            // entiendanme me dio pereza poner un sout para cada wea ((((
            System.out.println("***********************\n" +
                    "* GESTIÓN DICCIONARIO *\n" +
                    "***********************\n" +
                    "1. Añadir palabra\n" +
                    "2. Modificar palabra\n" +
                    "3. Eliminar palabra\n" +
                    "4. Consultar palabra\n" +
                    "5. Mostrar diccionario\n" +
                    "6. Jugar\n" +
                    "7. Mejores puntuaciones\n" +
                    "---------------------\n" +
                    "0. Salir\n");
            seleccion = Integer.parseInt(scanner.nextLine());
            switch (seleccion) {
                case 1 -> anyadirPalabra();
                case 2 -> cambiarPalabra();
                case 3 -> eliminarPalabra();
                case 4 -> consultarPalabra();
                case 5 -> mostrarDiccionario();
                case 6 -> jugar();
                case 7 -> mostrarPuntuacion();
            }
        } while (seleccion != 0);
    }
    private static void anyadirPalabra() {
        System.out.println("Indique la palabra");
        String palabra = scanner.nextLine();
        System.out.println("Indique el significado");
        String significado = scanner.nextLine();
        palabras.put(palabra, significado);
        System.out.println("Palabra añadida");
    }

    private static void cambiarPalabra() {
        System.out.println("Indique la palabra");
        String palabra = scanner.nextLine();
        System.out.println("Indique el significado");
        String significado = scanner.nextLine();
        palabras.replace(palabra,significado);
        System.out.println("Palabra cambiada");
    }
    private static void eliminarPalabra() {
        System.out.println("Indique la palabra");
        String palabra = scanner.nextLine();
        palabras.remove(palabra);
        System.out.println("Palabra eliminada");
    }
    private static void consultarPalabra() {
        System.out.println("Indique la palabra");
        String palabra = scanner.next();
        System.out.println(palabras.get(palabra));
    }
    private static void mostrarDiccionario() {
        System.out.println("palabras: ");
        for (String palabra : palabras.keySet()) {
            System.out.println(palabra);
        }
    }
    private static void jugar() {
        int puntuacion = 0;
        String palabraAAcertar;
        boolean fallido = false;
        do {
            for (String significado : palabras.keySet()) {
                System.out.println(significado);
                palabraAAcertar = scanner.nextLine();
                if (!significado.equals(palabraAAcertar)) {
                    System.out.println("la palabra era: " + palabras.get(significado));
                    System.out.println("Indique su usuario: ");
                    usuarios.put(scanner.nextLine(), puntuacion);
                    fallido = true;
                } else {
                    puntuacion++;
                }
            }
        } while (!fallido);
    }
    private static void mostrarPuntuacion() {
        // muchas grasas chatgpt, si me lo explican pq ns como hacer esto taria wapo xd
        System.out.println("Top 5: ");
        usuarios.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .limit(5)
                .forEach(entry -> System.out.println(entry.getKey()));
    }
}
