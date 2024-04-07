import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int colunas;
        
        System.out.println("Digite o número de colunas: ");
        colunas = sc.nextInt();
        
        while (colunas <= 0) {
            System.out.println("Número de colunas inválido. Por favor, digite novamente: ");
            colunas = sc.nextInt();
        }
        
        exibirMenu();
        int opcao = sc.nextInt();
        
        switch (opcao) {
            case 1:
                exibirRetangulo(colunas);
                break;
            case 2:
                exibirDiagonalSuperiorEsquerda(colunas);
                break;
            case 3:
                exibirDiagonalSuperiorDireita(colunas);
                break;
            case 4:
                exibirDiagonalInferiorEsquerda(colunas);
                break;
            case 5:
                exibirDiagonalInferiorDireita(colunas);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        
        sc.close();
    }
    
    public static void exibirMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1. Retângulo");
        System.out.println("2. Diagonal Superior Esquerda");
        System.out.println("3. Diagonal Superior Direita");
        System.out.println("4. Diagonal Inferior Esquerda");
        System.out.println("5. Diagonal Inferior Direita");
    }
    
    public static void exibirRetangulo(int colunas) {
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void exibirDiagonalSuperiorEsquerda(int colunas) {
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (j >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
    public static void exibirDiagonalSuperiorDireita(int colunas) {
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (j >= colunas - i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
    public static void exibirDiagonalInferiorEsquerda(int colunas) {
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (j <= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
    public static void exibirDiagonalInferiorDireita(int colunas) {
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (j <= colunas - i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
