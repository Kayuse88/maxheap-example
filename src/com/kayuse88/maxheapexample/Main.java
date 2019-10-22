package com.kayuse88.maxheapexample;

public class Main {

    public static void main(String[] args) {
        int[] data = new int[]{13,14,19,65,26,32,31,21,16,68};

        MaxHeap heap = new MaxHeap(20);

        for(int i : data)
            heap.insert(i);

        while(!heap.isEmpty()) {
            int min = heap.deleteMax();

            System.out.print(min + " ");
        }
    }
}
