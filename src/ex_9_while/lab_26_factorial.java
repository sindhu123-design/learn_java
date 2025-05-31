package ex_9_while;
import java.util.Scanner;
public class lab_26_factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");


        if(!scanner.hasNextInt()){
            System.out.println("enter an integer");
        }
        int number= scanner.nextInt();
        if(number<=0){
            System.out.println("enter non negative integer");
        }
        int factorial=1;
        int i =1;
        while(i<=number){
            factorial=factorial*i;
            i++;

        }
        System.out.println(factorial);

    }
}
