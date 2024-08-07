import java.util.Scanner;
public class CountDigit {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to count a specific digit in it:");
        int number = sc.nextInt();
        System.out.println("Now enter a digit to count");
        int dig = sc.nextInt();
        System.out.println("The digit "+ dig + " occurs " + count_digit(number , dig) + " times in " + number);
    }
    public static int count_digit (int n , int digit){
        if (n==0)
            return 0;
        int lastdigit = n%10;

        if (lastdigit==digit)
            return 1+count_digit(n/10 , digit);
          return count_digit(n/10 , digit);
    }
}
