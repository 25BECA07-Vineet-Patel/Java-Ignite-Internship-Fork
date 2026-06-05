import java.util.Scanner;
import java.util.InputMismatchException;

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

        GameCharacter[] enemies = {
                new GameCharacter("Dragon", 100, 10),
                new GameCharacter("Goblin", 80, 8),
                new GameCharacter("Orc", 120, 12)
        };

        System.out.println("================================");
        System.out.println("       CHOOSE YOUR ENEMY");
        System.out.println("================================");

        for (int i = 0; i < enemies.length; i++) {
            System.out.println((i + 1) + ". " + enemies[i].name);
        }

        GameCharacter currentEnemy = null;

        while (currentEnemy == null) {

            try {

                System.out.print("Enter Enemy Choice: ");
                int enemyChoice = sc.nextInt();

                if (enemyChoice < 1 || enemyChoice > enemies.length) {
                    System.out.println("Invalid Enemy Choice!");
                    continue;
                }

                currentEnemy = enemies[enemyChoice - 1];

            } catch (InputMismatchException e) {

                System.out.println("Invalid Input! Enter a number.");
                sc.nextLine();
            }
        }

        while (true) {

            System.out.println("\n==============================");
            System.out.println("        GAME STATUS");
            System.out.println("==============================");

            player.showStats();
            currentEnemy.showStats();

            System.out.println("\n1. Attack");
            System.out.println("2. Defend");
            System.out.println("3. Heal");
            System.out.println("4. Exit");

            int choice;

            try {

                System.out.print("\nEnter Choice: ");
                choice = sc.nextInt();

            } catch (InputMismatchException e) {

                System.out.println("Invalid Input! Enter a number.");
                sc.nextLine();
                continue;
            }

            switch (choice) {

                case 1:

                    player.attack(currentEnemy);

                    if (currentEnemy.getHealth() <= 0) {

                        System.out.println("\n" + currentEnemy.name + " Defeated!");

                        boolean allDefeated = true;

                        for (GameCharacter enemy : enemies) {

                            if (enemy.getHealth() > 0) {

                                allDefeated = false;

                                if (enemy != currentEnemy) {

                                    currentEnemy = enemy;

                                    System.out.println(
                                            "\nA new enemy appears: "
                                                    + currentEnemy.name);
                                }

                                break;
                            }
                        }

                        if (allDefeated) {

                            System.out.println("\nAll Enemies Defeated!");
                            System.out.println("Player Wins!");

                            sc.close();
                            return;
                        }
                    }

                    break;

                case 2:

                    currentEnemy.attack(player);

                    if (player.getHealth() <= 0) {

                        System.out.println("\nPlayer Defeated!");
                        System.out.println("Game Over!");

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