import java.util.Scanner;

public class prod {
    public static void main (String args[]){
        int product;
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        product = a * b;
        System.out.println("Product is : "+ product);
    }
    
}
