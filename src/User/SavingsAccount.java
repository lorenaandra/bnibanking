package User;

public class SavingsAccount {

    /*
     * savings account id in system
     */
    public static Integer savings_account_id = 0;

    /*
     * iban of base account
     */
    public String iban;

    /*
     * current sold in savings
     */
    public Double sold;

    /*
     * user's id
     */
    public Integer user_id;

    public SavingsAccount(String iban, Integer user_id) {
        savings_account_id++;
        this.iban = iban;
        this.sold = 0.00;
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "\n\nSavingsAccount{" +
                "savings_account_id=" + savings_account_id + '\'' +
                ", iban='" + iban + '\'' +
                ", sold=" + sold +
                ", user_id=" + user_id +
                '}';
    }
}
