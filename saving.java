class SavingAccount {
    double balance;
    static double interest;

    public SavingAccount(double balance) {
        this.balance = balance;
    }

    public void calMonthlyInterest() {
        double monthlyInterest = (balance * interest / 12) / 100;
        balance += monthlyInterest;
    }

    public static void modifyInterest(double newInterest) {
        interest = newInterest;
    }

    public void printBalance() {
        System.out.println("balance: " + balance);
    }

    public static void main(String args[]) {
        SavingAccount account1 = new SavingAccount(1000.00);
        SavingAccount account2 = new SavingAccount(2000.00);

        System.out.println("account 1 info: ");
        account1.printBalance();
        account1.modifyInterest(4.0);
        account1.calMonthlyInterest();
        account1.printBalance();
        account1.modifyInterest(5.0);
        account1.calMonthlyInterest();
        account1.printBalance();

        System.out.println();
        System.out.println("account 2 info: ");
        account2.printBalance();
        account2.modifyInterest(4.0);
        account2.calMonthlyInterest();
        account2.printBalance();
        account2.modifyInterest(5.0);
        account2.calMonthlyInterest();
        account2.printBalance();
    }
}
