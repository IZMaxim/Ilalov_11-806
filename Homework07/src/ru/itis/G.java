package ru.itis;

public class G {
    public static void main(String[] args) {
        int n = 12345;
        G(n);
    }
    static void G(int n){
        if (n < 10){
            System.out.println(n);
            return;
        }
        else{
            G(n / 10);
            int k = n % 10;
            System.out.println(k);
        }
    }
}
