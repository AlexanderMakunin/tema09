package com.alexandermakunin.ejercicio5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        Paciente[] pacientes = new Paciente[5];
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime tiempo1 = LocalDateTime.parse("12/02/1980 00:00", dateTimeFormatter);
        LocalDateTime tiempo2 = LocalDateTime.parse("07/03/1990 00:00", dateTimeFormatter);
        LocalDateTime tiempo3 = LocalDateTime.parse("20/03/1967 00:00", dateTimeFormatter);
        LocalDateTime tiempo4 = LocalDateTime.parse("20/04/1972 00:00", dateTimeFormatter);
        LocalDateTime tiempo5 = LocalDateTime.parse("29/02/1960 00:00", dateTimeFormatter);
        pacientes[0] = new Paciente("juanita",tiempo1, Paciente.Sexo.F,57,1.63);
        pacientes[1] = new Paciente("juanita2",tiempo2, Paciente.Sexo.F,60.5,1.74);
        pacientes[2] = new Paciente("juanita3",tiempo3, Paciente.Sexo.F,50.8 ,1.62);
        pacientes[3] = new Paciente("juanito",tiempo4, Paciente.Sexo.M,72.5 ,1.78);
        pacientes[4] = new Paciente("juanito2",tiempo5,85.2 ,1.8);
        System.out.println(Arrays.toString(ManejadorDePacientes.majorMenor(pacientes)));
        System.out.println(Arrays.toString(ManejadorDePacientes.pacientsPerSexe(pacientes)));
        for (Paciente paciente : pacientes) {
            System.out.println(ManejadorDePacientes.IMC(paciente));
        }
        for (Paciente paciente : pacientes) {
            System.out.println(ManejadorDePacientes.mensajePorIMC(paciente));
        }
    }
}
