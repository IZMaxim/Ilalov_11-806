package ru.itis;

import java.util.Scanner;

public class HelpArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) { //ввод чисел массива
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) { //вывод чисел массива
            System.out.println(arr[i]);
        }
    }
}