public class Main {
    public static void main(String[] args) {
        // let's do this
        double initialCreditDebt = 5000.00;
        double INTEREST_RATE = 0.17;
        double creditInterest = 0.00;
        double totalDebt = 0.00;


        totalDebt = initialCreditDebt;
        System.out.println("Your initial credit debt is " + initialCreditDebt + ".");

        creditInterest = totalDebt * INTEREST_RATE;
        totalDebt = totalDebt + creditInterest;
        System.out.println("Your interest after one month " +
                "is " + creditInterest + " and your new total debt is " + totalDebt + ".");

        creditInterest = totalDebt * INTEREST_RATE;
        totalDebt = totalDebt + creditInterest;
        System.out.println("Your interest after two months " +
                "is " + creditInterest + " and your new total debt is " + totalDebt + ".");



    }
}