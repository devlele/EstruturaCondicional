import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        if (num < 0) {
            System.out.println("Negativo");
        }
        else {
            System.out.println("Positivo");
        }

        sc.close();
    }
}
