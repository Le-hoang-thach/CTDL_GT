package baitaptrenlop.tuan08;

import java.util.Arrays;

public class selectionSort {
    
        public static void main(String[] args){
            int mang[] = new int[] { 3,7,2,9,5};
            System.out.println("Mảng  : " + Arrays.toString(mang));
            selectionSort(mang);
            System.out.println("Mảng sau sắp xếp là : " + Arrays.toString(mang));  
        } 
        public static void selectionSort(int []arr){ 
            for(int i =0 ;i<arr.lenght-1;i++){
                int index = i;
                for(int j =i+1;j<arr.lenght;j++){
                    if(arr[j]<arr[index]){
                        index = j;
                    }
                }
                int smallerNumber = arr[index];
                arr[index] = arr[i];
                arr[i] = smallerNumber;
            }
        } 
}
