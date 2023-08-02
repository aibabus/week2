package POJO_Classes;

public class Customers {
    private long customers_id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;

    public Customers() {

    }

    public long getCustomers_id() {
        return customers_id;
    }

    public void setCustomers_id(long customers_id) {
        this.customers_id = customers_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
