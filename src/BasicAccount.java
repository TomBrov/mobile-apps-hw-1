public class BasicAccount implements IAccount {
    private int accountNumber;
    private double withdrawalLimit;
    private double balance;

    public BasicAccount(int accountNumber, double withdrawalLimit) {
        this.accountNumber = accountNumber;
        this.withdrawalLimit = Math.max(0, withdrawalLimit); // Must be positive
        this.balance = 0;
    }

    @Override
    public void Deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    @Override
    public double Withdraw(double amount) {
        if (amount <= 0) return 0;
        double allowedWithdraw = Math.min(amount, withdrawalLimit);
        allowedWithdraw = Math.min(allowedWithdraw, balance);
        balance -= allowedWithdraw;
        return allowedWithdraw;
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
