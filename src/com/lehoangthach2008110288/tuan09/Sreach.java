package com.lehoangthach2008110288.tuan09;

public class Sreach {
    public static void main(String[] args) {

        int[] arr = { 2, 3, 4, 5, 6 };
        System.out.println("Tìm kiếm nằm ở phần tử thứ : " + binarySreach(arr, 5));
    }

    public static int binarySreach(int arr[], int x) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int m = 1 + (right - left) / 2;
            // Check it í present at mid
            if (arr[m] == x)
                return m;
            // If x greater , igmore left half
            if (arr[m] < x)
                left = m + 1;
            // If x is smaller . igmore right half
            else
                right = m - 1;
        }
        // if we reach here , then element was
        // not present
        return -1;
    }
}
