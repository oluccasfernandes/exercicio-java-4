import java.util.Scanner;

public class inteiro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int produtoImpares = 1;
        int somaPares = 0;
        
        while (true) {
            System.out.print("Digite um número (ou digite 0 para parar): ");
            int numero = sc.nextInt();
            
            if (numero == 0) {
                break;
            }
            
            if (numero % 2 == 0) {
                somaPares += numero;
            } else {
                produtoImpares *= numero;
            }
        }
        
        System.out.println("O produto dos números ímpares é: " + produtoImpares);
        System.out.println("A soma dos números pares é: " + somaPares);
        
        sc.close();
    }
}
