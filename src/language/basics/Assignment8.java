package language.basics;

public class Assignment8 {
    public static void main(String[] args) {
        int[] transactions = {50000, -2000, 3000, -15000, -200, -300, 4000, -3000};

        int creditCount = 0;
        int debitCount = 0;
        int creditTotal = 0;
        int debitTotal = 0;
        int suspiciousCount = 0;

        for (int i = 0; i < transactions.length; i++) {
            int amount = transactions[i];

            if (amount > 0) {
                creditCount++;
                creditTotal += amount;

                if (amount > 10000) {
                    System.out.println("Suspicious credit transaction with Amount: " + amount);
                    suspiciousCount++;
                }
            } else {
                debitCount++;
                debitTotal += -amount; // make it positive for total

                if (-amount > 10000) {
                    System.out.println("Suspicious debit transaction with Amount: " + amount);
                    suspiciousCount++;
                }
            }
        }

        System.out.println("\nTotal number of credit transactions: " + creditCount);
        System.out.println("Total number of debit transactions: " + debitCount);
        System.out.println("Total amount credited: " + creditTotal);
        System.out.println("Total amount debited: " + debitTotal);
        System.out.println("Total amount remaining in account: " + (creditTotal - debitTotal));
        System.out.println("Total number of suspicious transactions: " + suspiciousCount);
    }
}
