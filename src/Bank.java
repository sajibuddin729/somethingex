import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bank {
    private List<Customer> customers = new ArrayList<>();
    private List<BankEmployee> employees = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addEmployee(BankEmployee employee) {
        employees.add(employee);
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<BankEmployee> getEmployees() {
        return employees;
    }


}
