import java.util.Scanner;

public class string_handling {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        try {
            System.out.print("Enter index for charAt(): ");
            int index = sc.nextInt();

            System.out.println("Character = " + str.charAt(index));

            System.out.print("Enter start index for substring(): ");
            int start = sc.nextInt();

            System.out.print("Enter end index for substring(): ");
            int end = sc.nextInt();

            System.out.println("Substring = " + str.substring(start, end));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Invalid index handled safely.");
        }

        sc.close();
    }
}
