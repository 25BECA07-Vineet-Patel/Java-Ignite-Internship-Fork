import java.util.Scanner;

class GameCharacter {

    String name;
    private int health;
    private int attackPower;

    GameCharacter(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    void attack(GameCharacter enemy) {

        enemy.health -= this.attackPower;

        if (enemy.health < 0) {
            enemy.health = 0;
        }

        System.out.println(
                this.name + " attacked "
                        + enemy.name
                        + " and reduced health by "
                        + this.attackPower);
    }

    void heal() {

        health += 10;

        if (health > 100) {
            health = 100;
        }

        System.out.println(name + " healed and gained 10 health.");
    }

    int getHealth() {
        return health;
    }

    void showStats() {
        System.out.println(name + " Health : " + health);
    }
}

public class mini_game {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GameCharacter player = new GameCharacter("Player", 100, 15);

        GameCharacter dragon = new GameCharacter("Dragon", 100, 10);

        int choice;

        while (true) {

            System.out.println("\n==============================");
            System.out.println("        GAME STATUS");
            System.out.println("==============================");

            player.showStats();
            dragon.showStats();

            System.out.println("\n1. Attack");
            System.out.println("2. Defend");
            System.out.println("3. Heal");
            System.out.println("4. Exit");

            System.out.print("\nEnter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    player.attack(dragon);

                    if (dragon.getHealth() <= 0) {

                        System.out.println("\nDragon Defeated!");
                        System.out.println("Player Wins!");

                        sc.close();
                        return;
                    }

                    break;

                case 2:

                    dragon.attack(player);

                    if (player.getHealth() <= 0) {

                        System.out.println("\nPlayer Defeated!");
                        System.out.println("Dragon Wins!");

                        sc.close();
                        return;
                    }

                    break;

                case 3:

                    player.heal();

                    break;

                case 4:

                    System.out.println("Exiting Game...");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }
}