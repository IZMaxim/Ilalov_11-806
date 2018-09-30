package ru.itis;

import java.util.Scanner;

public class Homework08_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк и столбцов: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - i; j++) {
                arr[i][j] = k;
                k++;
            }
            for (int j = i + 1; j < n - i; j++) {
                arr[j][n - i - 1] = k;
                k++;
            }
            for (int j = n - i - 2; j >= i ; j--) {
                arr[n - i - 1][j] = k;
                k++;
            }
            for (int j = n - i - 2; j >= i + 1; j--) {
                arr[j][i] = k;
                k++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
