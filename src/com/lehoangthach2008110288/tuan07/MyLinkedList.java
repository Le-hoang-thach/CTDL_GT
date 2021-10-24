package com.lehoangthach2008110288.tuan07;

public class MyLinkedList {
    Node  head = null; 
    Node tail = null ; 

    Node  node = new Node();

    public MyLinkedList(){}

    void add(int data){
        // Tạo 1 Node mới 
        Node newNode = new Node(data);
        // Kiểm tra xem danh sách 
        if(head == null ){// thêm 1 nút vào dánh sách rỗng
            // Nếu danh sách rỗng thì cả head và tail đều trỏ tới newNode
            head = newNode ;
            tail = newNode ;
        }else { // danh sách không rỗng
            // newNode sẽ được thêm và sau tail
            // THÀNH PHẦN LIÊN KẾT CỦA TAIL SẼ LIÊN KÉT ĐẾN
              tail.next = newNode ;
            // newNode sẽ trở thành tail mới.
              tail = newNode ;
        }
    }

    void addFirst (int data){
         // Tạo 1 Node mới 
         Node newNode = new Node(data);
         // Kiểm tra xem danh sách 
         if(head == null ){// thêm 1 nút vào dánh sách rỗng
             // Nếu danh sách rỗng thì cả head và tail đều trỏ tới newNode
             head = newNode ;
             tail = newNode ;
         }else { // danh sách không rỗng
             // newNode sẽ được thêm và head
             // THÀNH PHẦN LIÊN KẾT CỦA TAIL SẼ LIÊN KÉT ĐẾN
               newNode.next = head  ;
             // newNode sẽ trở thành head mới.
               head = newNode ;
         }
    }

    
    void print(){
        // Tạo 1 nút hiện tại để giữ head đầu   
        Node current = head ;
        
        if(head == null){
            System.out.println("Danh sách rỗng ???");
            return  ; // dừng chương trình 
        }
        System.out.println("Các nút trong danh sách : ");
        while(current != null){
            // In ra thông tin mỗi nút.
           System.out.println(current.data);
           current = current.next ;
        }
    }
    void search(int data){
       
    }
    void clearAll(){
        head = tail = null ;
    }
    
    void removeHead (){
        head = head.next ;
    }

    void removeTail(){
        Node temp = head ;
        while(temp != null){
            if(temp.next ==tail){
                temp.next=null ;
                tail = temp ;
                break ;
            }
            temp = temp.next ;
        }
        
    }
}
