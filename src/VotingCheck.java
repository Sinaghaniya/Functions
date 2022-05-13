
import java.util.Scanner;

public class VotingCheck {

    static String AgeCheck(int age){//function

        if(age>=18){
            return "You are EGIBLE To Vote";
        }else{
            return "You are Not Egible";
        }

    }

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        System.out.println(AgeCheck(age));
    }
}
