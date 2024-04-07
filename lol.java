import java.util.Scanner;

public class lol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int killsTotal = 0;
        int deathsTotal = 0;
        int assistsTotal = 0;
        boolean winner = false;
        
        while (!winner) {
            System.out.println("Informe o número de kills, deaths e assists da rodada:");
            int killsRound = sc.nextInt();
            int deathsRound = sc.nextInt();
            int assistsRound = sc.nextInt();
            
            killsTotal += killsRound;
            deathsTotal += deathsRound;
            assistsTotal += assistsRound;
            
            System.out.println("Kills totais: " + killsTotal);
            System.out.println("Deaths totais: " + deathsTotal);
            System.out.println("Assists totais: " + assistsTotal);
            
            if (killsTotal <= 5) {
                System.out.println("Noob");
            } else if (killsTotal >= 20) {
                System.out.println("Master");
            }
            
            if (deathsTotal >= 20) {
                System.out.println("Houston, we have a problem");
            }
            
            if (assistsTotal >= 20) {
                System.out.println("Team work");
            }
            
            System.out.println("Há um vencedor? (true/false)");
            winner = sc.nextBoolean();
        }
        
        System.out.println("Fim do jogo!");
        sc.close();
    }
}
