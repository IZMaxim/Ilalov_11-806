package ru.itis;

import java.util.Scanner;

public class Homework08_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean magic = true;
        System.out.println("Введите количетво строк и столбцов: ");
        int n = sc.nextInt();
        System.out.println("Введите числа массива: ");
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
        }
        for (int i = 0; i < n; i++) {
            sum2 += arr[i][n - 1 - i];
        }
        if (sum1 != sum2){
            magic = false;
        }
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
            }
            if (sum != sum1){
                magic = false;
            }
        }
        System.out.println("Магический квадрат " + magic);
    }
}
