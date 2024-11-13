import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer {
    private String name;
    private int customerId;
    private List<BankAccount> accounts = new ArrayList<>();

    public Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }

}
