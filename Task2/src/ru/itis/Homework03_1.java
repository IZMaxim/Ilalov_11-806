package ru.itis;

import java.util.Scanner;

public class Homework03_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sr = 0;
        int kol = 0;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sr = sr + arr[i];
        }
        sr = sr / n;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > sr) {
                kol = kol + 1;
            }
        }
        System.out.println(sr);
        System.out.println(kol);
    }
}
