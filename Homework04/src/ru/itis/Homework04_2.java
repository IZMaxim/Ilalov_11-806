package ru.itis;

import java.util.Scanner;

public class Homework04_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String s = sc.nextLine();
        String n = "";
        System.out.println("Введите положительное число:");
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            char len = s.charAt(s.length() - 1);
            n += len;
            for (int j = 0; j < s.length() - 1; j++) {
                char a = s.charAt(j);
                n += a;
            }
            s = n;
            n = "";
        }
        System.out.println(s);
    }
}
