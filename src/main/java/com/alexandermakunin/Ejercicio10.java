package com.alexandermakunin;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio10 {
    private static class Empleado {
        private final String id;
        private final String nombre;
        private final String apellido;
        private final LocalDateTime fechaNacimiento;
        private int sueldo;
        ArrayList<Hijo> hijos;

        private Empleado(String id, String nombre, String apellido, LocalDateTime fechaNacimiento, int sueldo) {
            this.id = id;
            this.nombre = nombre;
            this.apellido = apellido;
            this.fechaNacimiento = fechaNacimiento;
            this.sueldo = sueldo;
        }
        private void setSueldo(int sueldo) {
            this.sueldo = sueldo;
        }
        private void anyadirHijo(Hijo hijo) {
            hijos.add(hijo);
        }
        private void removeHijo(String nombre) {
            hijos.remove(hijos.contains(nombre));
        }
        public int getEdadEmpleado() {
            return LocalDateTime.now().compareTo(fechaNacimiento);
        }
    }
    private static class Hijo {
        private final String nombre;
        private int edad;

        private Hijo(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
    }
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Empleado> empleados;
    public static void main(String[] args) {
        int seleccion;
        do {
            System.out.println("*********************\n" +
                    "* GESTIÓN EMPLEADOS *\n" +
                    "*********************\n" +
                    "1. Nuevo empleado\n" +
                    "2. Nuevo hijo\n" +
                    "3. Modificar sueldo\n" +
                    "4. Borrar empleado\n" +
                    "5. Borrar hijo\n" +
                    "6. Consultas\n" +
                    "---------------------\n" +
                    "0. Salir");
            seleccion = Integer.parseInt(scanner.nextLine());
        } while (seleccion != 0);
        switch (seleccion) {
            case 1 -> nuevoEmpleado();
            case 2 -> nuevoHijo();
            case 3 -> modificarSueldo();
            case 4 -> borrarEmpleado();
            case 5 -> borrarHijo();
            case 6 -> consultas();
        }
    }
    private static void nuevoEmpleado() {
        System.out.println("Indique el documento de identidad");
        String id = scanner.nextLine();
        if (empleados.contains(id)) {
            System.out.println("ese empleado ya existe");
            return;
        } else {
            System.out.println("Indique el nombre");
            String nombre = scanner.nextLine();
            System.out.println("Indique el apellido");
            String apellido = scanner.nextLine();
            System.out.println("Indique el fechaNacimiento");
            LocalDateTime fechaNacimiento = LocalDateTime.parse(scanner.nextLine());
            System.out.println("Indique el sueldo");
            int sueldo = Integer.parseInt(scanner.nextLine());
            empleados.add(new Empleado(id,nombre,apellido,fechaNacimiento,sueldo));
        }
    }
    private static void nuevoHijo() {
        System.out.println("Indique el documento de identidad");
        String id = scanner.nextLine();
        if (empleados.contains(id)) {
            System.out.println("Indique el nombre");
            String nombre = scanner.nextLine();
            System.out.println("Indique la edad");
            int edad = Integer.parseInt(scanner.nextLine());
            for (Empleado empleado : empleados) {
                if (empleado.id == id) {
                    empleado.anyadirHijo(new Hijo(nombre,edad));
                    return;
                }
            }
        }
    }
    private static void modificarSueldo() {
        System.out.println("Indique el documento de identidad");
        String id = scanner.nextLine();
        if (empleados.contains(id)) {
            System.out.println("Indique el suledo");
            int sueldo = Integer.parseInt(scanner.nextLine());
            for (Empleado empleado : empleados) {
                if (empleado.id == id) {
                    empleado.setSueldo(sueldo);
                    return;
                }
            }
        }
    }
    private static void borrarEmpleado() {
        System.out.println("Indique el documento de identidad");
        String id = scanner.nextLine();
        if (empleados.contains(id)) {
            empleados.remove(empleados.contains(id));
            return;
        }
    }
    private static void borrarHijo() {
        System.out.println("Indique el documento de identidad");
        String id = scanner.nextLine();
        if (empleados.contains(id)) {
            System.out.println("Indique el nombre");
            String nombre = scanner.nextLine();
            System.out.println("Indique la edad");
            int edad = Integer.parseInt(scanner.nextLine());
            for (Empleado empleado : empleados) {
                if (empleado.id == id) {
                    empleado.removeHijo(nombre);
                    return;
                }
            }
        }
    }
    private static void consultas() {
        int seleccion;
        do {
            System.out.println("***********************\n" +
                    "* CONSULTAS EMPLEADOS *\n" +
                    "***********************\n" +
                    "1. Buscar por NIF\n" +
                    "2. Buscar por nombre\n" +
                    "3. Buscar por rango de edad.\n" +
                    "4. Buscar por rango de sueldo.\n" +
                    "5. Buscar por hijos menores de edad\n" +
                    "-----------------------------\n" +
                    "0. Volver al menú principal");
            seleccion = Integer.parseInt(scanner.nextLine());
        } while (seleccion != 0);
        switch (seleccion) {

        }
    }
    private static void buscarNif() {
        System.out.println("Indique el nif");
        String nif = scanner.nextLine();
        for (Empleado empleado : empleados) {
            if (empleado.id.equals(nif)) {
                System.out.println(empleado);
                break;
            }
        }
    }
    private static void buscarNombre() {
        System.out.println("Indique el nombre");
        String nombre = scanner.nextLine();
        for (Empleado empleado : empleados) {
            if (empleado.nombre.contains(nombre)) {
                System.out.println(empleado);
            }
        }
    }
    private static void buscarRangoEdad() {
        System.out.println("Indique la edad minima");
        int minEdad = Integer.parseInt(scanner.nextLine());
        System.out.println("Indique la edad maxima");
        int maxEdad = Integer.parseInt(scanner.nextLine());
        for (Empleado empleado : empleados) {
            if (empleado.getEdadEmpleado() >= minEdad || empleado.getEdadEmpleado() <= maxEdad) {
                System.out.println(empleado);
            }
        }
    }
    private static void buscarRangoSueldo() {
        System.out.println("Indique el sueldo minima");
        int minSueldo = Integer.parseInt(scanner.nextLine());
        System.out.println("Indique el sueldo maxima");
        int maxSueldo = Integer.parseInt(scanner.nextLine());
        for (Empleado empleado : empleados) {
            if (empleado.sueldo >= minSueldo || empleado.sueldo <= maxSueldo) {
                System.out.println(empleado);
            }
        }
    }
    private static void buscarHijosMenores() {
        for (Empleado empleado : empleados) {
            for (Hijo hijo : empleado.hijos) {
                if (hijo.edad < 18) {
                    System.out.println(empleado);
                    break;
                }
            }
        }
    }
}
