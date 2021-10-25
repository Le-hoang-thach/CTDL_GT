package vn.giadinh.edu.tuan08;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemoProgram {
    public static void main(String[] args) {
        Queue <Integer>  queue;
        queue = new LinkedList<>();

        queue.add(8);
        queue.add(10);
        queue.add(2);
        System.out.println(queue);
        int phanTuDuocLayRa = queue.remove();

        System.out.println("Phần tử được lấy ra Queue " + phanTuDuocLayRa);

        System.out.println("Phần tử còn lại trong Queue");

        System.out.println(queue);

        int phanDuocTham = queue.peek();

        System.out.println("Phần tử được thăm  " +phanDuocTham);

        System.out.println("Phẩn tử còn lại được thăm :");

        System.out.println(queue);
    }
}
