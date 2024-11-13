public class BankEmployee {
    private String name;
    private int employeeId;

    public BankEmployee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void openAccount(Customer customer, BankAccount account) {
        customer.addAccount(account);
        System.out.println("Account opened for customer " + customer.getName());
    }

}
