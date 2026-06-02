import java.util.Scanner;

public class arena_winner {

    // Method to determine winner
    static String findWinner(int player1Score, int player2Score) {

        if (player1Score > player2Score) {
            return "Player 1 Wins";
        } else if (player2Score > player1Score) {
            return "Player 2 Wins";
        } else {
            return "Match Draw";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Player 1 Score: ");
        int player1Score = sc.nextInt();

        System.out.print("Enter Player 2 Score: ");
        int player2Score = sc.nextInt();

        // Method call
        String result = findWinner(player1Score, player2Score);

        System.out.println(result);

        sc.close();
    }
}