import java.util.Scanner;

/**
 * Created by snalband on 5/17/16.
 */
public class DiamondWithNameDemo {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter n Value:: ");
        int n = in.nextInt();
        System.out.print("Enter ur Name:: ");
        String Name=in.next();
        DiamondWithName diamondwithname=new DiamondWithName();
        diamondwithname.PrintDiamondWithName(n,Name);
    }
}

class DiamondWithName {
    public void PrintDiamondWithName(int n,String Name) {
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            if(i==n-1){
                System.out.print(Name);
            }
            else{
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }}
            System.out.println();
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}