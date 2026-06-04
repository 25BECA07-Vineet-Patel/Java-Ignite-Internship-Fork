import java.util.Scanner;

public class string_compression {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int count = 1;

        for (int i = 0; i < s.length() - 1; i++) {

            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                System.out.print(s.charAt(i));
                System.out.print(count);
                count = 1;
            }
        }

        System.out.print(s.charAt(s.length() - 1));
        System.out.print(count);
        sc.close();
    }
}