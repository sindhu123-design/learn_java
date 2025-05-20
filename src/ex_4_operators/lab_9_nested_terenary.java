package ex_4_operators;

public class lab_9_nested_terenary {
    public static void main(String[] args){
        int age=80;
        String result=(age>65)? "senior":((age>18)? "adult":"minor");
        System.out.println(result);

    }
}
