package com.alexandermakunin;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        GenericDynamicArray<String> t = new GenericDynamicArray();
        t.add("1");
        t.add("UwU");
        t.add("3");
        t.set(1,null);
        for (String test : t) {
            System.out.println(test);
        }for (String test : t) {
            System.out.println(test);
        }
        t.next();
        Set<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(22);
        numeros.add(3);
        System.out.println(numeros.add(1));
        System.out.println(numeros);
    }
}