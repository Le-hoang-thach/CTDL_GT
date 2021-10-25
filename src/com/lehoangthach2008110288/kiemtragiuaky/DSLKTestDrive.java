package com.lehoangthach2008110288.kiemtragiuaky;

import java.util.Scanner;

public class DSLKTestDrive {
    static int chon;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        do{
            System.out.println("Thêm táo :                             ");
            System.out.println("In danh sách táo :                     ");
            System.out.println("Thêm 1 trái táo vào trước táo tìm được ");
            System.out.println("Xóa táo cuối danh sách :               ");
            System.out.println("Thoát                                  ");
            System.out.println("Mời bạn chọn : ");
            chon = input.nextInt();
            switch(chon){
                case 1:
            }]

        }while(chon != 4);
        
        void indanhsasch() {
            DSLK myLinkedList = new MyLinkedList();
            System.out.println(".>Danh sách ban đầu");
            myLinkedList.print();
            System.out.println();
        } 
       
        void themtao() {
            System.out.println("Thêm táo đầu danh sách :");

            myLinkedList.addFirst();
            System.out.println(".>Thêm đầu danh sách");
            myLinkedList.print();
            System.out.println();
        }
        void xoamottraitao() {
            myLinkedList.removeTail();
            System.out.println(".>Xóa cuối danh sách");
            myLinkedList.print();
            System.out.println();
        }

        

        
    }
}
