import java.util.*;
import java.io.*;

public class index{

    /**
     * @return
     */
    public static int NumGame(){

        Scanner sc=new Scanner(System.in);
        int num,guess,nguesses=1;
        num=1+(int)(100*Math.random());

        do{
            System.out.println("Guess any number from 1 to 100");
            System.out.println("");
            guess=sc.nextInt();

            if(guess>num){
                System.out.println("Lower Number Please!!!");
            }

            else if(guess<num){
                System.out.println("Higher Number Please!!!");
            }
            else{
                System.out.println("Your Guess is Correct that is "+num+" "+"hurray!!! and attempts"+" "+nguesses);

            }
            nguesses++;


        }
        while(guess != num);
        {
            return 0;
        }
        

    }
    public static void main(String[] args){
        NumGame();
    }
}
