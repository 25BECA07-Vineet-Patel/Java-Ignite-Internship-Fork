import java.util.Scanner;

public class reverse_word {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            for (int j = word.length() - 1; j >= 0; j--) {
                System.out.print(word.charAt(j));
            }

            System.out.print(" ");
        }
        sc.close();
    }
}