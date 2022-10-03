import java.util.Scanner;

public class Subtract {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int result=num1-num2;
        System.out.println("subtract="+ result);
    }
}

