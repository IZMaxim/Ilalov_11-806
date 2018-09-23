package ru.itis;

import java.util.Scanner;

public class Homework04_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int j = 0, l = n2 - 1;
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int i = 0; i < n1; i++) {
            int k = i - j;
            if (arr2[j] == arr1[i]){
                if (j == l){
                    System.out.println(k);
                    break;
                }
                j++;
            }
        }
    }
}
