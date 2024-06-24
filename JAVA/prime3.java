import java.util.Scanner;

public class prime3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num != 1 || num != 2) {
            for (int i = 2; i < Math.sqrt(num); i++) { //sqrt decreses the number size and let the code run fast
                if (num % i == 0) {
                    System.out.println(num + "is not a prime");
                    break;
                } else {
                    System.out.println(num + " is a prime number");
                    break;
                }
            }
        } else {
            System.out.println(num + " is already a prime number");
        }
    }
}