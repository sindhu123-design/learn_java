package ex_6_if_condition;

public class lab_12 {

    public static void main(String[] args){

        int age= Integer.parseInt(args[0]);
        if (age>18)
        {
            System.out.println("can vote");
        }
         else{

            System.out.println("can not vote");
        }
    }
}
