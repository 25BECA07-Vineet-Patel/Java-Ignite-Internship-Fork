import java.util.Scanner;

public class college_adm {
    public static void main(String args[]) {
        int math, phy, chem;
        double avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Marks for Physics : ");
        phy = sc.nextInt();
        System.out.println("Input Marks for Chemistry : ");
        chem = sc.nextInt();
        System.out.println("Input Marks for Math : ");
        math = sc.nextInt();
        avg = (phy + chem + math) / 3.0;
        if (phy >= 60 && chem >= 60 && math >= 70 || avg >= 80) {
            System.out.println("Eligible for admission ");
            if (phy >= 90 && chem >= 90 && math >= 90)
                System.out.println("Scholarship Granted ");
            else
                System.out.println("Scholarship Not Granted ");
        }
        if (phy <= 35 || chem <= 35 || math <= 35)
            System.out.println("Not eligible for admission ");
        sc.close();
    }
}
