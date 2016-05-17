import java.util.Scanner;

/**
 * Created by snalband on 5/17/16.
 */
public class AsterisksVLineDemo {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n Value:: ");
        int n = in.nextInt();
        AsterisksVLine asterisksvline=new AsterisksVLine();
        asterisksvline.PrintnAsterisks(n);
    }

}

class AsterisksVLine{
    public void PrintnAsterisks(int n){
        for(int i=0;i<n;i++){
            System.out.println("*");
        }
    }


}
