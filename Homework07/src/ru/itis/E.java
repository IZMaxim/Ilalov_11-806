package ru.itis;

public class E {
    public static void main(String[] args) {
        int N = 112;
        System.out.println(E(N));

    }
    static int E(int N){
        if (N < 10){
            return N;
        }
        else {
            return N % 10 + E(N / 10);
        }
    }
}
