package ru.itis;

import java.util.Scanner;

public class Homework03_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int[] arr = new int[n];
        int num = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            while (arr[i] > 0){
                x = x + (arr[i] % 10) * num;
                arr[i] = arr[i] / 10;
                num = num * 10;
            }
        }
        System.out.println(x);
    }
}
