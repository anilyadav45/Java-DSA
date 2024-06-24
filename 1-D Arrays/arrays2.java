import java.util.*;

public class arrays2 {
    public static void main(String[] args) {
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);
        // taking inputs and outputs
        marks[0] = sc.nextInt();// For Math
        marks[1] = sc.nextInt();// For Physics
        marks[2] = sc.nextInt();// For Java
        System.out.println("Marks you obtained for Math is : " + marks[0]);
        System.out.println("Marks you obtained for Physics is : " + marks[1]);
        System.out.println("Marks you obtained for Java is : " + marks[2]);
        //Updation
        //in arrays its easy to resolve its mistake 
        marks[0] = 99;
        System.out.println("REcorrected Math : " +marks[0]);
    }
}
