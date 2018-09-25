package ru.itis;

import java.util.Scanner;

public class Homework06_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел в первом массиве: ");
        int n1 = sc.nextInt();
        System.out.println("Введите числа первого массива: ");
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Введите количество чисел во втором массиве: ");
        int n2 = sc.nextInt();
        System.out.println("Введите числа второго массива:");
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        int k = 0;
        int x = 0;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr1[i] != arr2[j]){
                    k++;
                }
            }
        }
        x = n1 + n2 - 2 * k;
        System.out.println(x);
    }
}
