package com.alexandermakunin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        class Profesor {
            private final String dni;
            private final String nombre;
            private final int sueldo;

            public Profesor(String dni, String nombre, int sueldo) {
                this.dni = dni;
                this.nombre = nombre;
                this.sueldo = sueldo;
            }
        }
        class Aula {
            private static int id = 0;
            private final int espacio;

            public Aula(int espacio) {
                id =+ 1;
                this.espacio = espacio;
            }
        }
        class Grupo {
            private static int id = 0;
            private final String nombre;
            private final Aula aula;
            public Grupo(String nombre, Aula aula) {
                id =+ 1;
                this.nombre = nombre;
                this.aula = aula;
            }
        }
        class Asignatura {
            private static int id = 0;
            private final String nombre;
            private final Profesor profesor;
            public Asignatura(String nombre, Profesor profesor) {
                id =+ 1;
                this.nombre = nombre;
                this.profesor = profesor;
            }

        }
        class Alumno {
            private static int id = 0;
            private final String nombre;
            private final Grupo grupo;
            private final ArrayList<Asignatura> asignaturas;

            public Alumno(String nombre, Grupo grupo, ArrayList<Asignatura> asignaturas) {
                id =+ 1;
                this.nombre = nombre;
                this.grupo = grupo;
                this.asignaturas = asignaturas;
            }
        }
        Scanner scanner = new Scanner(System.in);
        int seleccion;
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();
        asignaturas.add(new Asignatura("programacion de los cojones",new Profesor("Y1232143M","juan",1)));
        alumnos.add(new Alumno("Marcelo hagachate y conocelo",new Grupo("Bolainas",new Aula(20)),asignaturas));

        do {
            for (String menu : new String[]{"1. Dar alta", "2. Mostrar", "0. Salir"}) {
                System.out.println(menu);
            }
            seleccion = Integer.parseInt(scanner.nextLine());
            switch (seleccion) {
                case 1 -> {
                    do {
                        for (String menu : new String[]{"1. Alumnos", "2. Asignaturas", "3. Grupos", "4. Aulas", "5. Profesores", "0. Salir"}) {
                            System.out.println(menu);
                        }
                        seleccion = Integer.parseInt(scanner.nextLine());
                        switch (seleccion) {
                            case 1 -> {
                                System.out.println("Indique el nombre");
                                String nombre = scanner.nextLine();
                                System.out.println("Indique el grupo");
                                String grupo = scanner.nextLine();
                                for (Alumno alumno : alumnos) {
                                    if (alumno.nombre.equals(nombre) && alumno.grupo.nombre.equals(grupo)) {
                                        System.out.println("El alumno: " + alumno + " a sido eliminado exitosamente");
                                        alumnos.remove(alumno);
                                        return;
                                    }
                                }
                                System.out.println("no se encontro");
                            }
                            case 2 -> {
                                System.out.println("Indique la asignatura");
                                String asignatura = scanner.nextLine();
                                for (Alumno alumno : alumnos) {
                                    if (alumno.asignaturas.equals(asignatura)) {
                                        System.out.println("El grupo: " + alumno.asignaturas.equals(asignatura) + " a sido eliminado exitosamente");
                                        alumnos.remove(alumno.asignaturas.equals(asignatura));
                                        return;
                                    }
                                }
                                System.out.println("no se encontro");
                            }
                            case 3 -> {
                                System.out.println("Indique el grupo");
                                String grupo = scanner.nextLine();
                                for (Alumno alumno : alumnos) {
                                    if (alumno.grupo.nombre.equals(grupo)) {
                                        System.out.println("El grupo: " + alumno.grupo.nombre.equals(grupo) + " a sido eliminado exitosamente");
                                        alumnos.remove(alumno.grupo.equals(grupo));
                                        return;
                                    }
                                }
                                System.out.println("no se encontro");
                            }
                            case 4 -> {
                                System.out.println("Indique el aula");
                                String aula = scanner.nextLine();
                                for (Alumno alumno : alumnos) {
                                    if (alumno.grupo.aula.equals(aula)) {
                                        System.out.println("El grupo: " + alumno.grupo.aula.equals(aula) + " a sido eliminado exitosamente");
                                        alumnos.remove(alumno.grupo.aula.equals(aula));
                                        return;
                                    }
                                }
                                System.out.println("no se encontro");
                            }
                            case 5 -> {
                                System.out.println("Indique el profesor");
                                String profesor = scanner.nextLine();
                                for (Alumno alumno : alumnos) {
                                    for (Asignatura asignatura : alumno.asignaturas) {
                                        if (asignatura.profesor.nombre.equals(profesor)) {
                                            System.out.println("El grupo: " + asignatura.profesor.nombre.equals(profesor) + " a sido eliminado exitosamente");
                                            alumnos.remove(asignatura.profesor.nombre.equals(profesor));
                                            return;
                                        }
                                    }
                                }
                                System.out.println("no se encontro");
                            }
                            default -> {
                                System.out.println("ta mal elija bn");
                            }
                        }
                    } while (seleccion != 0);
                }
                case 2 -> {
                    do {
                        for (String menu : new String[]{"1. Grupos","2. Profesores", "0. Salir"}) {
                            System.out.println(menu);
                        }
                        seleccion = Integer.parseInt(scanner.nextLine());
                        switch (seleccion) {
                            case 1 -> {
                                System.out.println("Indique el grupo");
                                String grupo = scanner.nextLine();
                                for (Alumno alumno : alumnos) {
                                    if (alumno.grupo.nombre.equals(grupo)) {
                                        System.out.println(alumno);
                                    }
                                }
                            }
                            case 2 -> {
                                System.out.println("Indique el profesor");
                                String profesor = scanner.nextLine();
                                for (Alumno alumno : alumnos) {
                                    for (Asignatura asignatura : alumno.asignaturas) {
                                        if (asignatura.profesor.nombre.equals(profesor)) {
                                            System.out.println(alumno);
                                        }
                                    }
                                }
                            }
                            default -> {
                                System.out.println("ta mal elija bn");
                            }
                        }
                    } while (seleccion != 0);
                }
                default -> {
                    System.out.println("ta mal elija bn");
                }
            }
        } while (seleccion != 0);
    }
}
