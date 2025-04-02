package com.alexandermakunin;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] arrNum = new int[10];
        Random random = new Random();
        for (int i = 0; i < arrNum.length; i++) {
            arrNum[i] = random.nextInt(0,51);
        }
        ArrayList<Integer> arrayListNum = crearArrayListNum(arrNum);
        for (int num : arrayListNum) {
            System.out.println(num);
        }
    }
    private static ArrayList<Integer> crearArrayListNum(int[] arrNum) {
        ArrayList<Integer> arrayListNum = new ArrayList<>();
        for (int num : arrNum) {
            if (num % 2 == 0) {
                arrayListNum.add(num);
            }
        }
        for (int num : arrNum) {
            if (num % 2 != 0) {
                arrayListNum.add(num);
            }
        }
        return arrayListNum;
    }
}
