package com.example;
import java.util.Arrays;
import java.util.Comparator;

public class DataProcessor<T> {
  
    public T[] sortData(T[] data) {
        Arrays.sort(data);
        return data;
    }

  
    public T[] sortData(T[] data, Comparator<T> comparator) {
        Arrays.sort(data, comparator);
        return data;
    }

  
    public int searchData(T[] data, T target) {
        return Arrays.binarySearch(data, target);
    }

    public int searchData(T[] data, T target, Comparator<T> comparator) {
        int index = Arrays.binarySearch(data, target, comparator);
        return index;
    }
}
