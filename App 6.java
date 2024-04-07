import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroDeAlunos = 100;
        int matriculaMaiorNota = 0;
        int matriculaSegundaMaiorNota = 0;
        double maiorNota = Double.MIN_VALUE;
        double segundaMaiorNota = Double.MIN_VALUE;

        for (int i = 0; i < numeroDeAlunos; i++) {
            System.out.println("Digite a matrícula do aluno:");
            int matricula = sc.nextInt();

            System.out.println("Digite a nota do aluno:");
            double nota = sc.nextDouble();

            if (nota > maiorNota) {
                segundaMaiorNota = maiorNota;
                matriculaSegundaMaiorNota = matriculaMaiorNota;
                maiorNota = nota;
                matriculaMaiorNota = matricula;
            } else if (nota > segundaMaiorNota) {
                segundaMaiorNota = nota;
                matriculaSegundaMaiorNota = matricula;
            }
        }

        System.out.println("A maior nota é " + maiorNota + " e pertence ao aluno de matrícula " + matriculaMaiorNota);
        System.out.println("A segunda maior nota é " + segundaMaiorNota + " e pertence ao aluno de matrícula " + matriculaSegundaMaiorNota);

        sc.close();
    }
}
