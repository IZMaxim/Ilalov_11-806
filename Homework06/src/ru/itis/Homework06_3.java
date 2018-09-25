package ru.itis;

import java.util.Scanner;

public class Homework06_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите колличество чисел в Вашем массиве: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите числа:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(rav(arr, n));
    }

    static int rav(int[] arr, int n) {
        int p = 1;
        int max = p;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                p++;
            } else {
                if (max < p) {
                    max = p;
                }
                p = 1;
            }
        }
        return max;
    }
}
