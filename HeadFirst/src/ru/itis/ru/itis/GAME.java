package ru.itis;

import java.util.Scanner;

public class GAME {
    private static int healthRob = 100;
    private static int myHealth = 100;
    public static void game(){
        System.out.println("ROUND ONE");
        System.out.println("FIGHT!!!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Мое здоровье: " + myHealth + " Здороье робота: " + healthRob);
        while (healthRob >= 0 & myHealth >= 0) {
            System.out.println("Бьет робот");
            int fightR = (int) (Math.random() * 10);
            myHealth -= fightR;
            System.out.println("Мое здоровье: " + myHealth);
            if (myHealth >= 0) {
                System.out.println("Бьете вы. Введите силу удара");
                int myPow = sc.nextInt();
                int fightM = (int) (Math.random() * myPow);
                healthRob -= fightM;System.out.println("Здоровье робота: " + healthRob);
            }
        }
        if (healthRob <= 0) System.out.println("Ты победил!");
        if (myHealth <= 0) System.out.println("Ты проиграл!");
    }
}
