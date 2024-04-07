public class App {
    public static void main(String[] args) {
        int populacaoA = 5000000;
        double taxaNatalidadeA = 0.03; 
        int populacaoB = 7000000; 
        double taxaNatalidadeB = 0.02; 
        int anos = 0; 
        while (populacaoA <= populacaoB) {

            populacaoA += (int) (populacaoA * taxaNatalidadeA);
            populacaoB += (int) (populacaoB * taxaNatalidadeB);
            anos++; 
        }
        System.out.println("A população de A ultrapassará a população de B em " + anos + " anos.");
    }
}
