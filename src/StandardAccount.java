public class StandardAccount implements IAccount {
    private int accountNumber;
    private double creditLimit;
    private double balance;

    public StandardAccount(int accountNumber, double creditLimit) {
        this.accountNumber = accountNumber;
        this.creditLimit = (creditLimit > 0) ? 0 : creditLimit;
        this.balance = 0;
    }

    @Override
    public void Deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public double Withdraw(double amount) {
        if (amount <= 0) return 0;
        double maxWithdraw = balance - creditLimit;
        double withdrawn = Math.min(amount, maxWithdraw);
        balance -= withdrawn;
        return withdrawn;
    }

    @Override
    public double GetCurrentBalance() {
        return balance;
    }

    @Override
    public int GetAccountNumber() {
        return accountNumber;
    }
}
