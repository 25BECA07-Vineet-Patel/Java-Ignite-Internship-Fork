import java.util.*;

public class Scanner_ {
    public static void main(String args[]) {
        int result;
        double num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input decimal point number : ");
        num = sc.nextDouble();
        result = (int) num;
        System.out.println("Double result : " + num);
        System.out.println("Integer result : " + result);
        sc.close();
    }
}