package com.alexandermakunin.ejercicio4;

import java.util.ArrayList;
import java.util.Arrays;

public class Cola<T> implements ICola<T> {
    private ArrayList<T> tArrayList = new ArrayList<T>();
    private int size = 0;

    public Cola(ArrayList<T> tArrayList) {
        this.tArrayList = tArrayList;
    }

    @Override
    public boolean add(T e) {
        tArrayList.add(0, e);
        size++;
        return true;
    }

    @Override
    public T remove() {
        if (size <= 0) {
            return null;
        }
        T value = tArrayList.remove(size-1);
        size--;
        return value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T peek() {
        if (size<= 0) {
            return null;
        }
        return tArrayList.get(0);
    }

    @Override
    public boolean isEmpty() {
        if (size <= 0) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cola{" +
                "tArrayList=" + tArrayList +
                '}';
    }
}
