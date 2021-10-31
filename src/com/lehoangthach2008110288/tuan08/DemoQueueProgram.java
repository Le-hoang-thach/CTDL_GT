package com.lehoangthach2008110288.tuan08;
import java.util.LinkedList;
import java.util.Queue;

public class DemoQueueProgram {
    public static void main(String[] args) {
        
        Queue<Integer> queue = new LinkedList<>();

        queue.add(8);
        queue.add(10);
        queue.add(2);

        // lấy ra 1 phần tử - trong queue - lấy đầu

        System.out.println(queue);

        int phanTuLayRa = queue.remove();

        System.out.println("Phần tử được lấy ra từ queue "+phanTuLayRa);

        System.out.println("Phần tử còn lại : "+queue);

        // thăm 1 phần tử Queue - không loại bỏ khỏi danh sách
    
        int phantuDuocTham = queue.peek();

        System.out.println("Phần tử được thăm "+phantuDuocTham);
        System.out.println("Phần tử còn lại sau khi thăm "+queue);

        // Cài đặt Linked List 
            // thêm 1 phần tử vào cuối 
            // lấy 1 phần tử đầu
            // xóa 1 phần tử ở đầu.
        
        // Dùng Linked List để cài đặt cấu trúc Stack 
        // Cài đặt Linked List 
            // thêm 1 phần tử vào cuối 
            // lấy 1 phần tử cuối
            // xóa 1 phần tử ở cuối.
        
    }
    
}
