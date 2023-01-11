// Written by Ben.

import java.util.Scanner;

public class Main {

    public static int gcd(int a, int b) {
        if(a == 0) {
            return b;
        }
        
        if (b == 0) {
            return a;
        } 

        return gcd(b, a%b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers: ");

        System.out.println("GCD is " + gcd(sc.nextInt(), sc.nextInt()));
    }
}
