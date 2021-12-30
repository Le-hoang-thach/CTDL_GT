package baitaptrenlop.tuan08;

public class sapxep {
    public static void main(String[] args) {
        int mang[] = new int []{1,4,5,8,9,10};
        System.out.println("Mảng : " + mang);
        binarySreach(mang);
        System.out.println("phần tử cần tìm là:");
    }
    int binarySreach(int arr[] , int  x){
        int l =0 , r = arr.lenght - 1;
        while(1 <= r){
            int m = 1 + (r  -1 )/2;
            if(arr[m] ==x)
            1 = m +1;
            else
            r =m -1;
        }
        return -1;
    }
}
