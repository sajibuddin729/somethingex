import java.util.ArrayList;
import java.util.Date;
import java.util.List;

enum TransactionType {
    DEPOSIT, WITHDRAWAL
}

public class Transaction {
    private BankAccount account;
    private Date date;
    private double amount;
    private TransactionType transactionType;

    public Transaction(BankAccount account, Date date, double amount, TransactionType transactionType) {
        this.account = account;
        this.date = date;
        this.amount = amount;
        this.transactionType = transactionType;
    }

    public BankAccount getAccount() {
        return account;
    }

    public Date getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }
    public TransactionType getTransactionType() {
        return transactionType;
    }

}
