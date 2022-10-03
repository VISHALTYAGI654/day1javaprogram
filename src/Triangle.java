import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first angle: ");
        int a1 = sc.nextInt();
        System.out.print("Enter second angle: ");
        int a2 = sc.nextInt();
        System.out.print("Enter third angle: ");
        int a3 = sc.nextInt();
        int angleSum = a1 + a2 + a3;

        if (angleSum == 180 && a1 > 0 && a2 > 0 && a3 > 0) {

            System.out.println("Triangle is poosible");
        } else {
            System.out.println("Triangle not possible");
        }
    }
}
