
import java.util.Scanner;

public class PowerCal {

    static int PowerCal(int x,int n){

        int sum = 1;

     for(int i=1;i<=n;i++){

         sum = sum*x;


     }

     return sum;

    }

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Base Number");

        int x = sc.nextInt();

        System.out.println("Enter Power ");

        int n = sc.nextInt();

        System.out.println("Total:"+PowerCal(x,n));

    }
}
