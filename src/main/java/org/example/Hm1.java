package org.example;

import java.util.Scanner;

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class Hm1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        int num = scanner.nextInt();
        try {
            int res = div(num);
            System.out.println("Число корректно");
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int div (int num) throws DivisionByZeroException {
        if (num <= 0 ) {
                throw new DivisionByZeroException("Некорректное число ");
        }
        return num;
    }
}

