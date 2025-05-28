import java.sql.SQLOutput;
import java.util.Scanner;

public class Imposto {
    public static void main (String[] args) {
        double salary, tax;
        Scanner sc = new Scanner(System.in);

        salary = sc.nextDouble();

        if (salary <= 2000) {
            tax = 0;
        }
        else if (salary <= 3000) {
            tax = (salary - 2000) * 0.08;
        }
        else if (salary <= 4500) {
            tax = (salary - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else {
            tax = (salary - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (tax == 0) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f", tax);
        }
        sc.close();
    }
}
