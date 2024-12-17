import java.util.ArrayList;
import java.util.List;

public class Bank implements IBank {
    private List<IAccount> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    @Override
    public void OpenAccount(IAccount account) {
        accounts.add(account);
    }

    @Override
    public void CloseAccount(int accountNumber) {
        for (IAccount account : accounts) {
            if (account.GetAccountNumber() == accountNumber) {
                if (account.GetCurrentBalance() >= 0) {
                    accounts.remove(account);
                    System.out.println("Account closed successfully.");
                } else {
                    System.out.println("Cannot close account due to debt.");
                }
                return;
            }
        }
    }

    @Override
    public List<IAccount> GetAllAccounts() {
        return new ArrayList<>(accounts);
    }

    @Override
    public List<IAccount> GetAllAccountsInDebt() {
        List<IAccount> inDebt = new ArrayList<>();
        for (IAccount account : accounts) {
            if (account.GetCurrentBalance() < 0) inDebt.add(account);
        }
        return inDebt;
    }

    @Override
    public List<IAccount> GetAllAccountsWithBalance(double balanceAbove) {
        List<IAccount> filteredAccounts = new ArrayList<>();
        for (IAccount account : accounts) {
            if (account.GetCurrentBalance() > balanceAbove) filteredAccounts.add(account);
        }
        return filteredAccounts;
    }
}
