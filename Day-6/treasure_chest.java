import java.util.Scanner;

class TreasureChest {
    String playerName;
    int coinsCollected;
    String reward;

    TreasureChest(String playerName, int coinsCollected) {
        this.playerName = playerName;
        this.coinsCollected = coinsCollected;

        if (coinsCollected >= 1000) {
            reward = "Diamond Sword";
        } else if (coinsCollected >= 500) {
            reward = "Gold Sword";
        } else if (coinsCollected >= 100) {
            reward = "Iron Sword";
        } else {
            reward = "Wooden Sword";
        }
    }

    void display() {
        System.out.println("\nPlayer Name: " + playerName);
        System.out.println("Coins Collected: " + coinsCollected);
        System.out.println("Reward Unlocked: " + reward);
    }
}

public class treasure_chest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Player Name: ");
        String playerName = sc.nextLine();

        System.out.print("Enter Coins Collected: ");
        int coinsCollected = sc.nextInt();

        TreasureChest player = new TreasureChest(playerName, coinsCollected);

        player.display();

        sc.close();
    }
}