package com.alexandermakunin.ejercicio5;

import java.time.LocalDateTime;

public class ManejadorDePacientes {
    private static Paciente[] pacientes = new Paciente[100];

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


}
