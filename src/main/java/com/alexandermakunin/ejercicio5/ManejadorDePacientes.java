package com.alexandermakunin.ejercicio5;

import java.time.LocalDateTime;

public class ManejadorDePacientes {

    public static int[] majorMenor(Paciente[] pacientes) {
        int menor = pacientes[0].getEdadPaciente();
        int mayor = pacientes[0].getEdadPaciente();;
        int posicionMin = 0;
        int posicionMayor = 0;
        for (int i = 0; i < pacientes.length; i++) {
            if (pacientes[i].getEdadPaciente() > mayor) {
                mayor = pacientes[i].getEdadPaciente();
                posicionMayor = i;
            } else if (pacientes[i].getEdadPaciente() < menor) {
                menor = pacientes[i].getEdadPaciente();
                posicionMin = i;
            }
        }
        return new int[]{menor, mayor};
    }

    public static int[] pacientsPerSexe(Paciente[] pacientes) {
        int male = 0;
        int female = 0;
        for (Paciente paciente : pacientes) {
            if (paciente.getSexo() == Paciente.Sexo.M) {
                male++;
            } else {
                female++;
            }
        }
        return new int[]{male,female};
    }

    public static double IMC(Paciente paciente) {
        return paciente.getPeso() / (paciente.getAltura() * paciente.getAltura());
    }

    public static String mensajePorIMC(Paciente paciente) {
        double IMC = IMC(paciente);
        String message = "";
        if (IMC < 18.5) {
            message = "Peso insuficiente";
        } else if (IMC < 25) {
            message = "Peso normal";
        } else if (IMC < 27) {
            message = "Sobrepeso grado I";
        } else if (IMC < 30) {
            message = "Sobrepeso grado II";
        } else if (IMC > 30){
            message = "Sobrepeso grado III";
        }
        return message;
    }
}
