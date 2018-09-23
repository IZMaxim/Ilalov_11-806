package ru.itis;

import java.util.Scanner;

public class Homework04_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String s = sc.nextLine();
        System.out.println("Введите первое число:");
        int n1 = sc.nextInt();
        System.out.println("Введите второе число:");
        int n2 = sc.nextInt();
        String strResult = "";
        for (int i = 0; i < s.length(); i++) {
            char sy = s.charAt(i);
            if ((n1 > i) | (i > n2)){
                strResult += sy;
            }
        }
        System.out.println(strResult);
    }
}
