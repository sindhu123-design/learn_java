package ex_7_switch;
import java.util.Scanner;
public class lab_19 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = scanner.next();
        browser = browser.toLowerCase();

        switch (browser) {
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");

                break;
            case "edge":
                System.out.println("Execute the Edge Code");
                break;
            default:
                System.out.println("I have no idea which browser is this");
                break;


        }


    }


}

