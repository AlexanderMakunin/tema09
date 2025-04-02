package com.alexandermakunin.ejercicio5;

import java.time.LocalDateTime;

public class Paciente {
    public enum Sexo {
        M,F
    }

    private static int identificador = 0;
    private final String nombre;
    private final LocalDateTime fechaNac;
    private Sexo sexo = Sexo.M;
    private final float altura;
    private final float peso;

    public Paciente(String nombre, LocalDateTime fechaNac, Sexo sexo, float altura, float peso) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.sexo = sexo;
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

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    private int edadPaciente() {
        //return LocalDateTime.now() - getFechaNac();
        return 0;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", fechaNac=" + fechaNac +
                ", sexo=" + sexo +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }
}
