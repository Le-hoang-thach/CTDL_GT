package com.lehoangthach2008110288.tuan08;
import java.util.Stack;
public class DemoStackProgram {
    Stack<String> stack = new Stack<>();
        // thêm phần tử
        stack.push("WellCom");
        stack.push("To");
        stack.push("Data Structure And Alotithm");

        System.out.println(stack);

        // lấy ra 1 phần tử từ đỉnh của STack (xóa bỏ)
        String poped = stack.pop();

        System.out.println("Lấy ra từ stack "+ poped);

        System.out.println("Danh sách còn lại "+stack);

        // Thăm nút đỉnh // không loại khỏi danh sách 
        String phantuDuocTham = stack.peek();

        System.out.println("Thăm phần tử đỉnh : "+phantuDuocTham);

       //Stack<SinhVien> stack2 ;
}
