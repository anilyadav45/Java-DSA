import java.util.Scanner;

public class binarytodecimal {

    public static void bintodec(int n) {
        int pow = 0;
        int dec = 0;
        while (n > 0) {
            int lastD = n % 10;
            dec = dec + lastD * ((int) Math.pow(2, pow));
            pow++;
            n = n / 10;
        }
        System.out.println(dec);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary number to convert into Decimal : ");
        int n = sc.nextInt();
        bintodec(n);
    }
}