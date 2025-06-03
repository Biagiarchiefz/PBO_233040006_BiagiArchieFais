package Final_Static;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    // ERROR: Cannot override the final method from BankAccount
    // public void displayAccountInfo() {
    //     System.out.println("Savings Account Info:");
    //     super.displayAccountInfo();
    // }

    // Solusi: Tambahkan method khusus tanpa meng-override final method
    public void displaySavingsInfo() {
        System.out.println("Savings Account Info:");
        super.displayAccountInfo();
    }
}
