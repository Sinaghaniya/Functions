
import java.util.Scanner;

public class CircumferenceOfCircle {

    static void calCircum(float radius){

        float circum;

        circum = (float) (2*3.14*radius);//i have casted the variables of float by using (float) this;

        System.out.println(circum);
    }

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        float radius = sc.nextFloat();

        calCircum(radius);

    }
}
