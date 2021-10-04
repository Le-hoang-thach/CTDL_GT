package com.lehoangthach2008110288.tuan01.tuan02.tuan03;

public class lad4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên : ");
        int n = input.nextInt();
        String[] a = new String[n];
        
        for(int i=0;i<n;i++) {
            System.out.println("Nhập thông tin sinh viên thứ : "+i+" : ");
            System.out.print("Họ và tên sv: ");
             input.nextLine();
            a[i] = input.nextLine();
            
        }
        int b[]=new int[n];
        for(int i=0;i<n;i++) {
            System.out.println("Nhập thông tin sinh viên "+i+" : ");
            System.out.print("Điểm : ");
            b[i]=input.nextInt();
        }
        for(int i=0;i<n;i++) {
            if(b[i]<5) {
                System.out.println("Tên : "+ a[i] +"\n Điểm : "+b[i]+"\nHọc lực : Yếu");
            }
            if(b[i]>5 && b[i]<6.5) {

                System.out.println("Tên : " + a[i] + "\n Điểm : " + b[i] + "\nHọc lực: Trung bình");
            }
            if(b[i]>=6.5 && b[i]<7.5) {

                System.out.println("Tên : " + a[i] + "\n Điểm : " + b[i] + "\nHọc lực : Khá");
            }
            if(b[i]>=7.5 && b[i]<9) {

                System.out.println("Tên : "+ a[i] + "\n Điểm : " + b[i] + "\nHọc lực : Giỏi");
            }
            if(b[i]>=9) {

                System.out.println("Tên : " + a[i] + "\n Điểm : " + b[i] + "\nHọc lực : Xuất ");
            }
        } 
    }
}
