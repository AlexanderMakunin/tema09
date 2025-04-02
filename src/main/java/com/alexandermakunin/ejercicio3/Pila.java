package com.alexandermakunin.ejercicio3;

import java.util.ArrayList;

public class Pila<T> implements IPila<T> {
    private ArrayList<T> pila = new ArrayList<>();
    private int size = 0;

    public Pila(ArrayList<T> pila) {
        this.pila = pila;
    }

    @Override
    public T push(T e) {
        pila.add(e);
        size++;
        return e;
    }

    @Override
    public T pop() {
        if (size <= 0) {
            return null;
        }
        T value = pila.remove(size-1);
        size--;
        return value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T top() {
        if (size >= 1) {
            return pila.get(size);
        } else {
            return null;
        }
    }

    @Override
    public boolean isEmpty() {
        if (size() != 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "Pila{" +
                "pila=" + pila +
                '}';
    }
}
