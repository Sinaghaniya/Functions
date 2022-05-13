import java.util.Scanner;

public class GCF {

    static int calGCF(int n,int a,int b){

        int hcf=0;

        for(int i=1;i<=n;i++){

            if(a%i==0 && b%i==0){

                hcf = i;
            }

        }

        return hcf;
    }

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int b = sc.nextInt();

        int n = sc.nextInt();

        System.out.println("Highest Common Factor of a and b is:"+calGCF(n,a,b));

    }
}
