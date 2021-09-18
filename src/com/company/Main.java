package com.company;

public class Main {

    public static void main(String[] args) {
        int x = 0;
        int y = 4;
        int[] base = new int[y];
        for (int i = 0; i < base.length; i++) {
            base[x] = ((int) (Math.random() * 10)) + ((int) (Math.random() * 10));
            System.out.println(base[x]);
            x++;
        }
        System.out.println("Длина массива " + base.length);
        System.out.println("Последнее число в массиве " + base[base.length - 1]);
        System.out.println("Предпоследнее число в массиве " + base[base.length - 2]);

        // public static void int minFunction (int b; int b2);
        // int b =  base[base.length - 1];
        //  int b1 =  base[base.length - 2];
        if (base[base.length - 1] < base[base.length - 2]) {
            // min =  base.length - 1;
            System.out.println("Наименьшее число " + base[base.length - 1]);
        } else {
            System.out.println("Наименьшее число " + base[base.length - 2]);

        }
    }
}
