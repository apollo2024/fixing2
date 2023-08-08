package org.example;

import java.util.Scanner;

public class Hm2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = random(size);
        int num2 = scanner.nextInt();
        System.out.println("искаемое число в массиве" );
        int srch_num = scanner.nextInt();
        divisionByNumber(arr, num2, srch_num);
    }
    private static void divisionByNumber(int[] intArray, int num2, int srch_num) {
        try {
            double catchedRes1 = intArray[srch_num - 1] / num2;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.err.println("ошибка" + e);
        }catch (IndexOutOfBoundsException e2){
            System.err.println("ошибка" + e2);
        }
    }
    public static int[] random (int size){
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 31) - 15);
            System.out.println(array[i]);
        }
        return array;
    }

}
