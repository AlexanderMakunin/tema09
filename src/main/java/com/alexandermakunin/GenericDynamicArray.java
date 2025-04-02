package com.alexandermakunin;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * GenericDynamicArray
 * License: 🅮 Public Domain
 * Ejercicios de Pilas y Colas
 * @author Germán Gascón <ggascon@gmail.com>
 * @version 0.1, 2020-01-30
 * @since 0.1, 2020-01-30
 **/
public class GenericDynamicArray<T> implements Iterable<T>, Iterator<T> {
    /** Capacidad inicial por defecto del array */
    private final static int DEFAULT_CAPACITY = 10;
    /** Factor de crecimiento */
    private final static float GROW_FACTOR = 2f;
    /** Los datos del array */
    private Object[] data;
    /** Número de elementos del array */
    private int size;
    private int iterar = 0;

    /**
     * Crear un array dinámico con la capacidad inicial por defecto
     */
    public GenericDynamicArray() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Crea un array dinámico con la capacidad inicial indicada
     * @param capacity Capacidad inicial
     */
    public GenericDynamicArray(int capacity) {
        data = new Object[capacity];
        size = 0;
    }

    /**
     * Obtiene el elemento que ocupa el índice index
     * @param index Índice del elemento a obtener
     * @return el valor obtenido o ERROR
     */
    public T get(int index) {
        if (index >= size || index < 0)
            return null;
        return (T)data[index];
    }

    /**
     * Añade el elemento indicado al array
     * @param value Elemento a añadir
     * @return true
     */
    public boolean add(T value) {
        if (isFull())
            expand();
        data[size] = value;
        size++;
        return true;
    }

    /**
     * Método de uso interno para desplazar los elementos a la derecha a partir del índice indicado
     * @param index Índice a partir del cual se desplazarán los elementos
     */
    private void moveToRight(int index) {
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        size++;
    }


    /**
     * Añade el elemento indicado al array en la posición indicada por index
     * @param index Índice donde se añadirá el elemento
     * @param value Elemento a añadir
     * @return true
     */
    public boolean add(int index, T value) {
        if (index >= size || index < 0)
            return false;
        if (isFull())
            expand();
        moveToRight(index);
        data[index] = value;
        return true;
    }

    /**
     * Establece el valor del elemento con índice index
     * @param index Índice del elemento a modificar
     * @param value Valor que toma el elemento
     * @return true
     */
    public boolean set(int index, T value) {
        if (index >= size || index < 0)
            return false;
        data[index] = value;
        return true;
    }

    /**
     * Método de uso interno para ampliar la capacidad del array según el factor de crecimiento
     */
    private void expand() {
        Object[] array = new Object[Math.round(data.length * GROW_FACTOR)];
        for (int i = 0; i < data.length; i++)
            array[i] = data[i];
        data = array;
    }

    /**
     * Obtiene el número de elementos que hay en el array
     * @return int
     */
    public int size() {
        return size;
    }

    /**
     * Método de uso interno para determinar si el array está lleno
     * @return true si está lleno, false si no lo está
     */
    private boolean isFull() {
        return size >= data.length;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i < size; i++)
            sb.append(data[i]).append(" ");
        sb.append("]");
        return "GenericDynamicArray{" +
                "data=" + sb.toString() +
                ", size=" + size +
                '}';
    }

    @Override
    public Iterator<T> iterator() {
        iterar = 0;
        return this;
    }

    @Override
    public boolean hasNext() {
        return iterar < size;
    }

    @Override
    public T next() {
        if (get(iterar) != null) {
            return get(iterar++);
        } else {
            T value;
            do {
                value = get(iterar++);
            } while (value == null);
            return value;
        }
    }
}