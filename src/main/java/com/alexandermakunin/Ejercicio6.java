package com.alexandermakunin;

import java.util.Scanner;

public class Ejercicio6 {
    private static Scanner scanner = new Scanner(System.in);
    private static String[][] palabras = new String[100][2];
    private static int size = 0;
    public static void main(String[] args) {
        int num;
        do {
            System.out.println("MENÚ PRINCIPAL\n" +
                    "==============\n" +
                    "1. Introducir parejas de palabras.\n" +
                    "2. Traducir palabras.\n" +
                    "0. Salir de la aplicación.");
            num = Integer.parseInt(scanner.nextLine());
            switch (num) {
                case 1 -> introducirPalabras();
                case 2 -> traducirPalabra();
            }
        } while (num != 0);
    }
    private static void introducirPalabras() {
        System.out.println("Indique la palabra");
        String text = scanner.nextLine();
        System.out.println("Indique la palabra traducida");
        String textTraducido = scanner.nextLine();
        palabras[size][0] = text;
        palabras[size][1] = textTraducido;
        size++;
    }
    private static void traducirPalabra() {
        System.out.println("Indique la palabra");
        String text = scanner.nextLine();
        for (int i = 0; i < size;i++) {
            if (palabras[i][0].equals(text)) {
                System.out.println(palabras[i][1]);
                return;
            } else if (palabras[i][1].equals(text)) {
                System.out.println(palabras[i][0]);
                return;
            }
        }
        System.out.println("no se ha encontrado");
    }
}
