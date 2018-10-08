package ru.itis;

import java.util.Scanner;

public class ClassTestTask01 {  //ВАРИАНТ 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int n2 = n * n;
        int[] arr = new int[n2];
        System.out.println("Введите последовательность n в крвадрате: ");
        for (int i = 0; i < n2; i++) {
            arr[i] = sc.nextInt();
        }
        sortArr(arr);
        spiralFill(matrix, arr);
        System.out.println(underDiagonalSum(matrix));
    }


    public static int[] sortArr(int[] arr) {
        int buf;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] < arr[j]) {
                        buf = arr[j];
                        arr[j] = arr[i];
                        arr[i] = buf;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return arr;
    }


    public static int[][] spiralFill(int[][] matrix, int[] arr) {
        int k = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length - i; j++) {
                matrix[i][j] = arr[k];
                k++;
            }
            for (int j = i + 1; j < matrix.length - i; j++) {
                matrix[j][matrix.length - i - 1] = arr[k];
                k++;
            }
            for (int j = matrix.length - i - 2; j >= i; j--) {
                matrix[matrix.length - i - 1][j] = arr[k];
                k++;
            }
            for (int j = matrix.length - i - 2; j >= i + 1; j--) {
                matrix[j][i] = arr[k];
                k++;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        return matrix;
    }

    public static int underDiagonalSum(int[][] matrix){
        int sumUnder = 0;
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                sumUnder += matrix[i][j];
            }
        }
        return sumUnder;
    }
}
