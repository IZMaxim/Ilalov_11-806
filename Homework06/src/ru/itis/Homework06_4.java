package ru.itis;

import java.util.Scanner;

public class Homework06_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        System.out.println("Введите количество чисел в массиве: ");
        int n = sc.nextInt();
        System.out.println("Введите целые числа: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                }
            }
        }
        System.out.println(flag);
    }
}
