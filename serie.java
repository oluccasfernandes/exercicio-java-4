import java.util.Scanner;

public class serie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de termos da série: ");
        int n = sc.nextInt();
        
        int[] serie = new int[n];
        int count = 1;
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                serie[i] = count;
            } else {
                serie[i] = count;
                count++;
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(serie[i] + " ");
        }
    }
}
