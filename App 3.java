import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean jogarNovamente = true;

        while (jogarNovamente) {
            System.out.println("Bem-vindo ao Jogo de Adivinhação!");
            int numeroSecreto = (int) (Math.random() * 100) + 1;
            int tentativas = 0;
            boolean acertou = false;

            while (!acertou) {
                System.out.print("Tente adivinhar o número (entre 1 e 100): ");
                int palpite = sc.nextInt();
                tentativas++;

                if (palpite == numeroSecreto) {
                    System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
                    acertou = true;
                } else if (palpite < numeroSecreto) {
                    System.out.println("Seu palpite é muito baixo. Tente novamente.");
                } else {
                    System.out.println("Seu palpite é muito alto. Tente novamente.");
                }
            }

            System.out.print("Você gostaria de jogar novamente? (s/n): ");
            char escolha = sc.next().charAt(0);
            if (escolha != 's' && escolha != 'S') {
                jogarNovamente = false;
            }
        }

        System.out.println("Obrigado por jogar!");
        sc.close();
    }
}
