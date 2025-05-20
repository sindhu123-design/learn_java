package ex_4_operators;

public class lab_8_terenary_operator {
    public static void main(String[] args){
        int n1=12;
        int n2=15;
        int n3=2;
        int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 : ((n2 > n3) ? n2 : n3);
        System.out.println(max);

    }
}
