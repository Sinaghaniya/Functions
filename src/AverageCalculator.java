
import java.util.Scanner;

public class AverageCalculator {

    // 4+4+4+4 = 16
    // 16/4 = 4
    public static int aVg(int a,int b,int c){

        int sum = 0;

            sum = a+b+c;

            sum = sum/3;

        return sum;
    }

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);


        int a =sc.nextInt();

        int b = sc.nextInt();

        int c = sc.nextInt();

        System.out.println( aVg(a,b,c));

    }
}
