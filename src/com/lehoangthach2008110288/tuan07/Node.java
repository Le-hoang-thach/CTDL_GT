package com.lehoangthach2008110288.tuan07;

public class Node {
    // Nội dung
    int data;
    // Liên kết đén nút tiếp theo
    Node next; // Biến tham chiếu kiểu Node

    Node() {
    } // hàm tạo rỗng

    Node(int d) { // hàm tạo 1 tham chiếu
        data = d;
    }

    void Node(int d, Node n) { // hàm tạo 2 tham chiếu
        data = d;
        next = n;
    }
}
