package ru.job4j.it;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MatrixIt implements Iterator<Integer> {
    private final int[][] data;
    private int row;
    private int column;

    public MatrixIt(int[][] data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        boolean result = false;
        if (column == data[row].length) {
            column = 0;
            row++;
        }
        while (data.length > row) {
            if (data[row].length != 0) {
                result = true;
                break;
            }
            row++;
        }
        return result;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return data[row][column++];
    }

    public static void main(String[] args) {
        int[][] in = {{}};
        System.out.println(in.length);

        for (int i = 0; i < in.length; i++) {
            for (int j = 0; j < in[i].length; j++) {
                System.out.println(in[i].length);
            }
        }
        //System.out.println(in[1][0]);
    }

}