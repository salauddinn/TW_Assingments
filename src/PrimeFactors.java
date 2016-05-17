import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by snalband on 5/17/16.
 */
public class PrimeFactors {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n Value:: ");
        int n = in.nextInt();
        PrimeFactors pf = new PrimeFactors();
        ArrayList<Integer> N=pf.generate(n);
        for(int i:N){
            System.out.println(i);
        }

    }
    public ArrayList<Integer> generate(int n) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        int i=2;
        while (n > 1) {
            if (n % i == 0) {
               if(ar.contains(i)==false){
                   ar.add(i);
               }
                n=n/i;
            }
            else{
                i++;
            }
        }

        return ar;
    }
    }

