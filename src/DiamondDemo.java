import java.util.Scanner;

/**
 * Created by snalband on 5/17/16.
 */
public class DiamondDemo {

public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    System.out.print("Enter n Value:: ");
    int n = in.nextInt();
    Diamond diamond=new Diamond();
    diamond.PrintDiamond(n);
}
}

class Diamond{
public void PrintDiamond(int n){
    for (int i=0;i<n;i++){
        for (int k=0;k<n-i;k++){
            System.out.print(" ");
        }

        for(int j=0;j<i*2+1;j++){
         System.out.print("*");
        }
        System.out.println();
    }
    for(int i=n-2;i>=0;i--){
        for (int k=0;k<n-i;k++){
            System.out.print(" ");
        }

        for(int j=0;j<i*2+1;j++){
            System.out.print("*");
        }
        System.out.println();
    }

}
}