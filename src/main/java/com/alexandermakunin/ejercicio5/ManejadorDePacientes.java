package com.alexandermakunin.ejercicio5;

import java.time.LocalDateTime;

public class ManejadorDePacientes {

    public static int[] majorMenor(Paciente[] pacientes) {
        int menor = LocalDateTime.now().getYear() - pacientes[0].getFechaNac().getYear();
        int mayor = LocalDateTime.now().getYear() - pacientes[0].getFechaNac().getYear();
        int posicionMin = 0;
        int posicionMayor = 0;
        for (int i = 0; i < pacientes.length; i++) {
            if (pacientes[i].getFechaNac().getYear() > mayor) {
                mayor = pacientes[i].getFechaNac().getYear();
                posicionMayor = i;
            } else if (pacientes[i].getFechaNac().getYear() < menor) {
                menor = pacientes[i].getFechaNac().getYear();
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
