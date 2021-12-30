import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
       int x = scanner.nextInt(); 
        for(int i= x;i<500;i++){
            if(i%5 ==0){
                System.out.println(i +" ");
            }
        }
    }
}
