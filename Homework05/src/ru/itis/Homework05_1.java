package ru.itis;

import java.util.Scanner;

public class Homework05_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a, b, res = 0;
        String n = "y";
        while (true) {
            if (n.equals("y")) {
                System.out.println("Введите 1 число:");
                a = sc.nextDouble();
            } else {
                a = res;
            }
            System.out.println("Введите опратор:");
            String op = sc.next();
            System.out.println("Введите 2 число:");
            b = sc.nextDouble();
            if (op.equals("+")) {
                res = a + b;
                System.out.println("Ответ:" + res);
            }
            if (op.equals("-")) {
                res = a - b;
                System.out.println("Ответ:" + res);
            }
            if (op.equals("*")) {
                res = a * b;
                System.out.println("Ответ:" + res);
            }
            if (op.equals("/")) {
                res = a / b;
                System.out.println("Ответ:" + res);
            }
            System.out.println("Сбросить результат?y/n");
            n = sc.next();
        }
    }
}