import java.util.Scanner;
public class produto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A (número real): ");
        double a = sc.nextDouble();

        System.out.print("Digite o valor de B (número inteiro): ");
        int b = sc.nextInt();

        double produto = calcularProduto(a, b);

        System.out.println("O produto de " + a + " por " + b + " é: " + produto);

        sc.close();
    }

    private static double calcularProduto(double a, int b) {
        double produto = 0;

        for (int i = 0; i < Math.abs(b); i++) {
            produto += a;
        }

        if (b < 0) {
            produto = -produto;
        }

        return produto;
    }
}
