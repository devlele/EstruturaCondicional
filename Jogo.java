import java.util.Scanner;

public class Jogo {
    public static void main (String[] args) {
        int horaInicio, horaFim, duracao;

        Scanner sc = new Scanner(System.in);

        horaInicio = sc.nextInt();
        horaFim = sc.nextInt();

        if (horaInicio < horaFim) {
            duracao = horaFim - horaInicio;
        }
        else {
            duracao = 24 - horaInicio + horaFim;
        }

        System.out.printf("O jogo durou %d horas", duracao);
        sc.close();
    }
}
