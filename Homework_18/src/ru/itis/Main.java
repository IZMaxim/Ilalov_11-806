package ru.itis;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add(1, "1,5");
    }
}