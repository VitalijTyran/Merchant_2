package app;

// Модель объекта Продавца.
public class Merchant {

    private final String name;
    private final String phone;
    private final String lastname;

    public Merchant(String name, String phone, String lastname) {
        this.name = name;
        this.phone = phone;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getlastname() {
        return lastname;
    }
}
