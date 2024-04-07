import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite os números (Digite um número negativo ou zero para sair):");
        
        while (true) {
            System.out.print("Digite um número: ");
            double numero = sc.nextDouble();

            if (numero <= 0) {
                System.out.println("Programa encerrado.");
                break;
            }
            double quadrado = Math.pow(numero, 2);
            double cubo = Math.pow(numero, 3);
            double raizQuadrada = Math.sqrt(numero);

            System.out.println("Número: " + numero);
            System.out.println("Quadrado: " + quadrado);
            System.out.println("Cubo: " + cubo);
            System.out.println("Raiz Quadrada: " + raizQuadrada);
            System.out.println();
        }
        
        sc.close();
    }
}
