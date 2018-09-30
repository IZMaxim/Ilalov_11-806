package ru.itis;

import java.util.Scanner;

public class Homework08_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите колиество строк 1 массива: ");
        int strok1 = sc.nextInt();
        System.out.println("Введите количесов столбцов 1 массива: ");
        int stolb1 = sc.nextInt();
        System.out.println("Введите числа 1 массива: ");
        int[][] arr1 = new int[strok1][stolb1];
        for (int i = 0; i < strok1; i++) {
            for (int j = 0; j < stolb1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Введите колиество строк 2 массива: ");
        int strok2 = sc.nextInt();
        System.out.println("Введите количесов столбцов 2 массива: ");
        int stolb2 = sc.nextInt();
        System.out.println("Введите числа 2 массива: ");
        int[][] arr2 = new int[strok2][stolb2];
        for (int i = 0; i < strok2; i++) {
            for (int j = 0; j < stolb2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        int[][] result = new int[strok1][stolb2];
        for (int i = 0; i < strok1; i++) {
            for (int j = 0; j < stolb2; j++) {
                for (int k = 0; k < strok2; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println();
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
        }
    }
}