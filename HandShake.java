import java.util.Scanner;

public class HandShake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of persons in the room:");
        int noOfPersons = sc.nextInt();
        System.out.println("There are " + handShake(noOfPersons) + " hand shakes");
    }
    public static int handShake(int n){
        if(n<=1) {
            return 0;
        }
        else if(n == 2){
            return 1;
        }
        return (n-1) + handShake(n -1 );
    }
}
