import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();
        System.out.println("The GCD of "+ n1 + " and " + n2 + " is " + GCD(n1, n2));
    }
    public static int GCD(int x, int y){
        if(y ==0){
            return x;
        }
        int quotient = x/y;
        int remainder = x - quotient * y;
        return GCD(y , remainder);
    }
}
