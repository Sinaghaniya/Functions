
import java.util.Scanner;

public class infiniteLoop {

    static void InfiniteLoop(int x){

        do{
            System.out.println(x);
            x++;

        }while(x>0);

    }

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        InfiniteLoop(x);
    }
}
