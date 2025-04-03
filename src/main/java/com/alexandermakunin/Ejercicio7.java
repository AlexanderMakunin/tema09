package com.alexandermakunin;

import java.util.*;

public class Ejercicio7 {
    private static Scanner scanner = new Scanner(System.in);
    private static HashMap<String,Double> cambio = new HashMap<>();
    public static void main(String[] args) {
        String seleccion;

        cambio.put("USD",1.10);
        cambio.put("GBP",0.84);
        cambio.put("INR",94.06);
        cambio.put("AUD",1.74);
        cambio.put("CAD",1.55);
        cambio.put("ARS",1185.19);
        cambio.put("BOB",7.64);
        cambio.put("CLP",1055.73);
        cambio.put("VEZ",4592.90);
        cambio.put("CRC",556.90);
        cambio.put("CUP",26.53);
        cambio.put("DOP",69.80);
        cambio.put("MXN",22.02);
        do {
            System.out.println("************");
            System.out.println("*** MENU ***");
            System.out.println("************");
            System.out.println("Opciones: ");
            for (String string : cambio.keySet()) {
                System.out.println("tipo de moneda: " + string);
            }
            System.out.println("escriba salir para cerrar el programa");
            seleccion = scanner.nextLine();
            for (String string : cambio.keySet()) {
                if (seleccion.equals(string)) {
                    conversion(seleccion);
                    break;
                }
            }
            seleccion = scanner.nextLine();
        } while (seleccion != "salir");
    }
    private static void conversion(String tipo) {
        System.out.println("indique la cantidad");
        double num = scanner.nextDouble();
        System.out.println(num * cambio.get(tipo));
    }
}
