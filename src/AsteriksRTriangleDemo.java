import java.util.Scanner;

/**
 * Created by snalband on 5/17/16.
 */
public class AsteriksRTriangleDemo {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n Value:: ");
        int n = in.nextInt();
        AsterisksRTriangle asteriskrstriangle=new AsterisksRTriangle();
        asteriskrstriangle.PrintnAsterisks(n);
    }
}

class AsterisksRTriangle{
    public void PrintnAsterisks(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}