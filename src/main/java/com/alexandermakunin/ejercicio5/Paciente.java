package com.alexandermakunin.ejercicio5;

import java.time.LocalDateTime;

public class Paciente {
    public enum Sexo {
        M,F
    }

    private static int identificador = 1;
    private final String nombre;
    private final LocalDateTime fechaNac;
    private Sexo sexo = Sexo.M;
    private final double altura;
    private final double peso;

    public Paciente(String nombre, LocalDateTime fechaNac, Sexo sexo, double altura, double peso) {
        identificador++;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public Paciente(String nombre, LocalDateTime fechaNac, double altura, double peso) {
        identificador++;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.altura = altura;
        this.peso = peso;
    }

    public static int getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDateTime getFechaNac() {
        return fechaNac;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    private int edadPaciente() {
        return LocalDateTime.now().compareTo(getFechaNac());
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", fechaNac=" + edadPaciente() +
                ", sexo=" + sexo +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }
}
