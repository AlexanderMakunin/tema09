package com.alexandermakunin.ejercicio2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayListEstadisticas implements IEstadisticas {
    private ArrayList<Double> arrayListDouble = new ArrayList<Double>();

    public ArrayListEstadisticas(ArrayList<Double> arrayListDouble) {
        this.arrayListDouble = arrayListDouble;
    }

    @Override
    public double minimo() {
        double num = arrayListDouble.get(0);
        for (double arrayNum : arrayListDouble) {
            if (arrayNum < num) {
                num = arrayNum;
            }
        }
        return num;
    }

    @Override
    public double maximo() {
        double num = arrayListDouble.get(0);
        for (double arrayNum : arrayListDouble) {
            if (arrayNum > num) {
                num = arrayNum;
            }
        }
        return num;
    }

    @Override
    public double sumatorio() {
        double num = arrayListDouble.get(0);
        for (double arrayNum : arrayListDouble) {
            num = num + arrayNum;
        }
        return num;
    }

    @Override
    public double media() {
        double num = arrayListDouble.get(0);
        int count = 0;
        for (double arrayNum : arrayListDouble) {
            num = num + arrayNum;
            count++;
        }
        return num / count;
    }

    @Override
    public double moda() {
        double[] arrNum = new double[arrayListDouble.size()];
        Map<Integer, Double> modaMap = new HashMap<>();

        return 0;
    }
}
