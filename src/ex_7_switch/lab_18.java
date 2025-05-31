package ex_7_switch;

import java.util.Scanner;

public class lab_18 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter number 1 to 7");

        if (scanner.hasNextInt()) {
            int day = scanner.nextInt();


            switch (day) {
                case 1:
                    System.out.println("mon");
                    break;
                case 2:
                    System.out.println("tue");
                    break;
                case 3:
                    System.out.println("wed");
                    break;
                case 4:
                    System.out.println("thur");
                    break;
                case 5:
                    System.out.println("fri");
                    break;
                case 6:
                    System.out.println("sat");
                    break;
                case 7:
                    System.out.println("sun");
                    break;
                default:
                    System.out.println("enter only integer 1 to 7");
                    break;
            }

            }
        else
            {
                System.out.println("enter only integer values");
            }
        }
    }

