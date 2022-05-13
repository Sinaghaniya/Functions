import java.util.Scanner;

public class Fibonnaci {

    static void Fib(int n){

        int a=0,b=1,c;

        System.out.println(a+"\n"+b);

        //0 1 1 2 3 5 8 13
        //Fibonnaci Series

        for (int i =1;i<=n;i++) {

             c = a+b;

             a = b;

             b = c;

             System.out.println(c);

        }

    }

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Fib(n);

    }
}