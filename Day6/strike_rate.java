import java.util.Scanner;

class Batsman {
    String playerName;
    int runs;
    int balls;
    double strikeRate;

    Batsman(String playerName, int runs, int balls) {
        this.playerName = playerName;
        this.runs = runs;
        this.balls = balls;

        strikeRate = (runs * 100.0) / balls;
    }

    void display() {
        System.out.println("Player Name = " + playerName);
        System.out.println("Runs = " + runs);
        System.out.println("Balls = " + balls);
        System.out.println("Strike Rate = " + strikeRate);
    }
}

public class strike_rate {
    public static void main(String[] args) {
        String name;
        int runs, ball;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter batsman name : ");
        name = sc.nextLine();
        System.out.println("Enter no of runs scored by batsman : ");
        runs = sc.nextInt();
        System.out.println("Enter no of balls played by btsman :  : ");
        ball = sc.nextInt();
        Batsman b1 = new Batsman(name, runs, ball);
        b1.display();
        sc.close();
    }
}