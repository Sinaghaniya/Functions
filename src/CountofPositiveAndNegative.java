import java.sql.SQLOutput;
import java.util.Scanner;

public class CountofPositiveAndNegative {

    public static void main(String[]args){

        int pos=0,neg=0,zeros=0;

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<10;i++)

            arr[i] =sc.nextInt();
            for(int i=0;i<10;i++){

                if(arr[i]<0){
                    neg++;
                }else if(arr[i]>0){
                    pos++;
                }else if(arr[i]==0){
                    zeros++;
                }

            }

            System.out.println(neg);
            System.out.println(pos);
            System.out.println(zeros);
        }

    }
