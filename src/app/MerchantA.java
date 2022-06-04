package app;


public class MerchantA extends Merchant implements Bonus {

    String email;

    public MerchantA(String name, String phone, String email , String lastname) {
        super(name, phone, lastname);
        this.email = email;
    }

    public String infoMerchant() {
        String name = getName();
        String phone = getPhone();
        String lastname = getlastname();
        return "\nMerchant: " + name + ", " + phone + ", " + lastname + ", " + email +  "\n";
    }

    @Override
    public double calcBonus(double sales) {
        if (sales <= 10000) {
            return sales * 5 / 100;
        } else if (sales > 10000 && sales <= 30000) {
            return sales * 10 / 100;
        } else if (sales > 30000 && sales <= 50000) {
            return sales * 16 / 100;
        } else {
            return sales * 23 / 100;
        }
    }
}
