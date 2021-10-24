package com.lehoangthach2008110288.tuan07;

public class MyLinkedListTestDrive {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(4);
        myLinkedList.add(3);
        myLinkedList.add(8);
        System.out.println(".>Danh sách ban đầu");
        myLinkedList.print();
        System.out.println();

        myLinkedList.addFirst(5);
        System.out.println(".>Thêm đầu danh sách");
        myLinkedList.print();
        System.out.println();

        myLinkedList.add(10);
        System.out.println(".>Thêm cuối danh sách");
        myLinkedList.print();
        System.out.println();

        myLinkedList.removeHead();
        System.out.println(".>Xóa đầu danh sách");
        myLinkedList.print();
        System.out.println();

        myLinkedList.removeTail();
        ;
        System.out.println(".>Xóa cuối danh sách");
        myLinkedList.print();
        System.out.println();

        myLinkedList.clearAll();
        System.out.println(".>Xóa sạch danh sách liên kết");
        myLinkedList.print();
        System.out.println();
    }
}
