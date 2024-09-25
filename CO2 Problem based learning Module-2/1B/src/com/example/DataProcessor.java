package com.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DataProcessor<T extends Comparable<T>> {
    private List<T> data;

    public DataProcessor(List<T> data) {
        this.data = data;
    }

    public void sort() {
        Collections.sort(data);
    }

    public void sort(Comparator<T> comparator) {
        Collections.sort(data, comparator);
    }

    public int search(T target) {
        return Collections.binarySearch(data, target);
    }

    public int search(T target, Comparator<T> comparator) {
        return Collections.binarySearch(data, target, comparator);
    }
}