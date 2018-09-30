package ru.itis;

import java.util.Scanner;

public class Homework08_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество столбцов: ");
        int stolb = sc.nextInt();
        System.out.println("Введите количество строк: ");
        int strok = sc.nextInt();
        System.out.println("Введите числа: ");
        int[][] arr = new int[stolb][strok];
        for (int i = 0; i < stolb; i++) {
            for (int j = 0; j < strok; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int stolbSum = 0, maxStolbIndex = 0, strokSum = 0, maxStrokIndex = 0;
        for (int i = 0; i < strok; i++) {
            int maxStrokSum = 0;
            for (int j = 0; j < stolb; j++) {
                maxStrokSum += arr[i][j];
            }
            if (maxStrokSum > strokSum){
                strokSum = maxStrokSum;
                maxStrokIndex = i;
            }
        }
        for (int i = 0; i < stolb; i++) {
            int maxStolbSum = 0;
            for (int j = 0; j < strok; j++) {
                maxStolbSum += arr[i][j];
            }
            if (maxStolbSum > stolbSum){
                stolbSum = maxStolbSum;
                maxStolbIndex = i;
            }
        }
        for (int i = 0; i < strok; i++) {
            System.out.print(arr[maxStrokIndex][i] + " ");
        }
        System.out.println();
        for (int i = 0; i < stolb; i++) {
            System.out.print(arr[i][maxStolbIndex] + " ");
        }
    }
}
