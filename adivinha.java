import java.util.Scanner;
import java.util.Random;

public class adivinha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1; 
        int tentativas = 0;
        
        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Estou pensando em um número entre 1 e 100...");
        System.out.println("Tente adivinhar qual é!");
        
        int palpite;
        do {
            System.out.print("Digite seu palpite: ");
            palpite = sc.nextInt();
            tentativas++;
            
            if (palpite < numeroSecreto) {
                System.out.println("Muito baixo. Tente novamente.");
            } else if (palpite > numeroSecreto) {
                System.out.println("Muito alto. Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas!");
            }
        } while (palpite != numeroSecreto);
        
        sc.close();
    }
}
