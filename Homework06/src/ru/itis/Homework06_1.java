package ru.itis;

import java.util.Scanner;

public class Homework06_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (s[j].length() > s[j + 1].length()) {
                    String buf = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = buf;
                }
            }
        }
        for (String k : s) {
            System.out.println(k + " ");
        }
    }
}