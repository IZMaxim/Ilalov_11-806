package ru.itis;

import java.util.Scanner;

public class Homework03_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean f = true;
        int[] arr = new int[n];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (;k < n - 1 && arr[k] <= arr[k + 1]; k++);
        for (;k < n - 1 && f; k++) {
            if (arr[k] < arr[k + 1]){
                f = false;
            }
        }
        System.out.println(f);
        }
    }
