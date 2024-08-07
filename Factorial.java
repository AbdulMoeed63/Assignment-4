import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find factorial:");
        int num = sc.nextInt();
        System.out.println("Factorial is : " + factorial(num));
    }
    //Function
    public static int factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n ; i++) {
            fact *= i;
        }
        return fact;
    }
}
