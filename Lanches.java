import java.util.Scanner;

public class Lanches {
    public static void main (String[] args) {
        int cod, qtd;
        double conta;

        Scanner sc = new Scanner(System.in);
        cod = sc.nextInt();
        qtd = sc.nextInt();

        if (cod == 1) {
            conta = qtd*4;
        }
        else if (cod == 2) {
            conta = qtd*4.50;
        }
        else if (cod == 3) {
            conta = qtd*5;
        }
        else if (cod == 4) {
            conta = qtd*2;
        }
        else {
            conta = qtd*1.5;
        }

        System.out.printf("Total: R$ %.2f", conta);
        sc.close();
    }
}
