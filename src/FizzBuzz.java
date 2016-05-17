/**
 * Created by snalband on 5/17/16.
 */
public class FizzBuzz {
    public void fizzbuzz(){
        for (int i=1;i<=100;i++){
            if(i%3==0&&i%5==0){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }

    }
    public static void main(String args[]){
        FizzBuzz fb=new FizzBuzz();
        fb.fizzbuzz();
    }
}
