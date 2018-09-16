package ru.itis;

import java.io.File;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Homework03_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (arr[0] > arr[1]){
            sum++;
        }

        for (int i = 1; i < n-1; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1])
                sum++;
        }
        System.out.println(sum);
    }
}

