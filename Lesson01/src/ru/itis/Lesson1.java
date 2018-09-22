package ru.itis;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double res = 0;
        System.out.println("Введите первое число:");
        double a = sc.nextDouble();
        System.out.println("Введите оператор:");
        String op = sc.next();
        System.out.println("Введите второе число");
        double b = sc.nextDouble();
        if (op.equals("+")) {
            res = a + b;
        } else if (op.equals("-"))
            res = a - b;
        else if (op.equals("*"))
            res = a * b;
        else if (op.equals("/"))
            res = a / b;
        System.out.println(res);
    }
}