import java.util.Scanner;

public class Pallindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to find it is pallindrome or not :");
        String str = sc.nextLine();
        int check = isPalindrome(str, str.length());
        if (check==1){
            System.out.println("It is palindrome.");
        } else {
            System.out.println("Not a palindrome.");
        }
    }
    public static int isPalindrome (String s , int len){
        int i = 0;
        int j = len -1;
        if (len <= 1){
            return 1;
        }
        if (s.charAt(i) == s.charAt(j))
            return isPalindrome(s.substring(1, j), j -1);
        return 0;

    }
}
