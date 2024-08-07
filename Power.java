import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int b = sc.nextInt();
        System.out.println("Enter the exponent:");
        int e = sc.nextInt();
        System.out.println(b + " raised to the power " + e + " is "+ pow(b , e));
    }
    public static int pow(int base, int exponent){
        if (exponent == 0)
            return 1;
        if(exponent == 1)
            return base;
        return base * pow(base, exponent - 1);

    }
}
