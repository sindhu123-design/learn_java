package ex_7_switch;

import java.util.Scanner;

public class lab_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter month number");
        int result = scanner.nextInt();
        System.out.println("enter year");
        int year = scanner.nextInt();


            switch (result) {
                case 1, 3, 5, 7, 8, 10, 12:
                    System.out.println("31");
                    break;
                case 4, 6, 9, 11:
                    System.out.println("30");
                    break;
                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {

                        System.out.println("28");
                    }
                    else {
                        System.out.println("29");
                    }
                    break;


            }

        }

    }

