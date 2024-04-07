import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pessoasAcima50 = 0;
        double somaAlturas = 0;
        int pessoasEntre10e20 = 0;
        int pessoasComPesoInferior40 = 0;
        int totalPessoas = 10;

        for (int i = 0; i < totalPessoas; i++) {
            System.out.println("Digite a idade da pessoa " + (i + 1) + ":");
            int idade = sc.nextInt();
            System.out.println("Digite a altura da pessoa " + (i + 1) + " em metros:");
            double altura = sc.nextDouble();
            System.out.println("Digite o peso da pessoa " + (i + 1) + " em quilos:");
            double peso = sc.nextDouble();

            if (idade > 50) {
                pessoasAcima50++;
            }

            if (idade >= 10 && idade <= 20) {
                somaAlturas += altura;
                pessoasEntre10e20++;
            }

            if (peso < 40) {
                pessoasComPesoInferior40++;
            }
        }

        double mediaAlturas = pessoasEntre10e20 > 0 ? somaAlturas / pessoasEntre10e20 : 0;
        double percentualPesoInferior40 = (double) pessoasComPesoInferior40 / totalPessoas * 100;

        System.out.println("Quantidade de pessoas com idade superior a 50 anos: " + pessoasAcima50);
        System.out.println("Média das alturas das pessoas com idade entre 10 e 20 anos: " + mediaAlturas + " metros");
        System.out.println("Porcentagem de pessoas com peso inferior a 40 quilos entre todas as pessoas: " + percentualPesoInferior40 + "%");

        sc.close();
    }
}
