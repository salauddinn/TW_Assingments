/**
 * Created by snalband on 5/16/16.
 */
import java.util.Scanner;

public class AsterisksHLineDemo{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n Value:: ");
        int n = in.nextInt();
        AsterisksHLine asteriskshline=new AsterisksHLine();
        asteriskshline.PrintnAsterisks(n);
    }

}

class AsterisksHLine{
    public void PrintnAsterisks(int n){
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
    }


        }