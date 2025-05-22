package ex_6_if_condition;
import java.util.Scanner;

public class lab_16 {
    public static void main(String[] args)
    {
        System.out.println("Enter your age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age<13)
        {
            System.out.println("can not go to goa");
        }
        else {
            System.out.println("go to goa");
        }
    }
}
