public class BusinessContact extends ContactInfo {
    private String phone;

    public BusinessContact(String name, String email, String phone) {
        super(name, email);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void display() {
        System.out.println("\nBusiness Contacts:\nName:" + getName() + "\nEmail: " + getEmail() + "\nPhone Number: " + phone);
    }
}
