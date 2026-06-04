public class company_sales {

    public static void main(String[] args) {

        int sales[][] = {
                { 100, 200, 150, 250 },
                { 300, 250, 200, 150 },
                { 400, 300, 250, 200 }
        };

        int overallSales = 0;
        int maxSales = 0;
        int topBranch = 0;

        for (int i = 0; i < sales.length; i++) {

            int branchTotal = 0;

            for (int j = 0; j < sales[i].length; j++) {
                branchTotal += sales[i][j];
            }

            System.out.println("Branch " + (i + 1)
                    + " Total Sales = " + branchTotal);

            overallSales += branchTotal;

            if (branchTotal > maxSales) {
                maxSales = branchTotal;
                topBranch = i + 1;
            }
        }

        System.out.println("\nOverall Company Sales = "
                + overallSales);

        System.out.println("Highest Sales Branch = Branch "
                + topBranch);

    }
}