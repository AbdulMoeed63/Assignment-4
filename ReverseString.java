import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        System.out.println("Reversed string is: " + revString(str , str.length()));
    }
    public static String revString(String s, int len){
        int i = len - 1;
        String sm = s.toUpperCase();
        if(len <=1)
            return sm;
    return sm.charAt(i) + revString(sm.substring(0,i),i);

    }
}
