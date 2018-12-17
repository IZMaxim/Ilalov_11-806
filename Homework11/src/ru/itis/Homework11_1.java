package ru.itis;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Homework11_1 {
    private static int chars = 26;

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Words.txt");
        Scanner scanner = new Scanner(file);

        int count = 0;
        int maxLength = maxLength(scanner);
        while (count < maxLength) {
            split(count);
            union();
            count++;
        }
    }

    public static void union() throws FileNotFoundException {
        File file = new File("Words.txt");
        Scanner[] scanners = new Scanner[chars];
        PrintWriter printWriter = new PrintWriter(file);

        for (int i = 0; i < chars; i++) {
            scanners[i] = new Scanner(new File("Word" + i + ".txt"));
        }

        for (int i = 0; i < chars; i++) {
            while (scanners[i].hasNext()) {
                printWriter.println(scanners[i].next());
            }
        }
        printWriter.flush();
    }

    public static void split(int count) throws FileNotFoundException {
        File file = new File("Words.txt");
        Scanner scanner = new Scanner(file);
        PrintWriter[] printWriters = new PrintWriter[chars];

        for (int i = 0; i < chars; i++) {
            printWriters[i] = new PrintWriter("Word" + i + ".txt");
        }

        while (scanner.hasNext()) {
            String str = scanner.next();
            char letter = (str.length() - 1 > count) ? str.charAt(str.length() - count - 1) : str.charAt(0);
            int index = (int) letter - 97;

            printWriters[index].println(str);
            printWriters[index].flush();
        }
    }

    public static int maxLength(Scanner scanner) {
        int maxLength = 0;
        while (scanner.hasNext()) {
            int length = scanner.next().length();
            if (length > maxLength) maxLength = length;
        }
        return maxLength;
    }
} 