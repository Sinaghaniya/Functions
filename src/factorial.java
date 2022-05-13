
//this program will return factorial
//eg input 5
//1*5,5*4,20*3,60*2,120*1
// output 120


import java.util.Scanner;

public class factorial {

    static int factorial(int n) {

        if(n<0){
            System.out.println("Invalid num");
        }

        int sum = 1;

        for (int i = n; i >=1; i--){

            sum = sum*i;
        }

        return sum;

    }

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println(factorial(a));
    }
}
