package ru.itis;

public class I {
    public static void main(String[] args) {
        int n = 80;
        int del = 2;
        I(n, del);
    }
    static void I(int n, int del){
        int newVal = n / del;
        int newDel = del + 1;
        if (n < 2){
            return;
        }
        if (n % del != 0){
            I(n, newDel);
        }
        else {
            System.out.print(del + " ");
            I(newVal, del);
        }
    }
}
