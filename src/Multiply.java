import java.util.Scanner;

public class Multiply {

    static int multiply(int a,int b){

        return a*b;
    }

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int b = sc.nextInt();

        System.out.println(multiply(a,b));
    }
}
