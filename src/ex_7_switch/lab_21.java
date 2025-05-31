package ex_7_switch;
import java.util.Scanner;
public class lab_21 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter grade");
        char grade = scanner.next().charAt(0);
        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("fair");
                break;
            case 'C':
                System.out.println("needs improvement");
                break;
            case 'F':
                System.out.println("failed");
                break;
            default:
                System.out.println("invalid grade");
                break;

        }

    }
}
