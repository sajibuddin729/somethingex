public class Main {
    public static void main(String[] args) {
        // Create Bank
        Bank bank = new Bank();

        // Create Customer
        Customer customer1 = new Customer("Alice", 1);
        bank.addCustomer(customer1);

        // Create Bank Employee
        BankEmployee employee = new BankEmployee("Mr. Johnson", 101);
        bank.addEmployee(employee);

        // Open Bank Account for Customer
        BankAccount account1 = new BankAccount(1001, customer1);
        employee.openAccount(customer1, account1);

        // Perform Transactions
        account1.deposit(500.0);
        account1.withdraw(200.0);
}

}