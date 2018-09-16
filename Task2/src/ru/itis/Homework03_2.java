package ru.itis;

import java.util.Scanner;

public class Homework03_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < 0) arr[i] = -arr[i]; //abs
            if (max < arr[i]) max = i;
        }
        System.out.println(max);
        }
    }

