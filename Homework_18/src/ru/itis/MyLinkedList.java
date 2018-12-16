package ru.itis;

import java.util.Iterator;

public interface MyLinkedList<T> {
        void add(T element);

        void add(T element, int position);

        Node<T> get(int position);

        int size();

        Node<T>[] toArray();

        boolean contains(T element);

        void remove(int position);

        void addAll(MyLinkedList<T> elements);

        void addAll(MyLinkedList<T> elements, int position);

        Iterator<Node<T>> getIterator();
}