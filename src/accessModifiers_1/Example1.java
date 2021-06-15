package accessModifiers_1;
import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();        
        double d = scan.nextDouble();
        String val = scan.next();
        scan.close();

        // Write your code here.

        System.out.println("String: " + val);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}