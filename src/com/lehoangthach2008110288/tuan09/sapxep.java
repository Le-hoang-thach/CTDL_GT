package com.lehoangthach2008110288.tuan09;

import java.util.Arrays;

public class sapxep {
    public static void main(String[] args) {
        int mangSoNguyen[] = new int[] { 3, 6, 4, 2, 1 };
        System.out.println("Mảng : " + Arrays.toString(mangSoNguyen));
        electionSort(mangSoNguyen);
        System.out.println("Mảng sau khi electionSort: " + Arrays.toString(mangSoNguyen));
        System.out.println();

        int mangSoNguyen1[] = new int[] { 6, 5, 12, 52, 1 };
        System.out.println("Mảng : " + Arrays.toString(mangSoNguyen1));
        bubbleSort(mangSoNguyen1);
        System.out.println("Mảng sau khi bubleSort : " + Arrays.toString(mangSoNguyen1));
        System.out.println();

        int mangSoNguyen2[] = new int[] { 8, 5, 33, 24, 85 };
        System.out.println("Mảng : " + Arrays.toString(mangSoNguyen2));
        sort(mangSoNguyen2);
        System.out.println("Mảng sau khi Sort: " + Arrays.toString(mangSoNguyen2));
        System.out.println("Phần tử tìm kiếm  : " + sreach(mangSoNguyen2, 2));

    }

    public static int sreach(int[] arr, int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    public static void sort(int[] arr) { /// Sắp xếp chèn
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            /*
             * Move elements of arr[0..i-1], that are greater than key, to one postion ahead
             * ò their current postion
             */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void bubbleSort(int[] arr) { // sắp xếp nổi bật
        int temp = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    // swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void electionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

}
