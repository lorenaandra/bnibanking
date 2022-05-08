package User;

import org.apache.commons.lang3.RandomStringUtils;

/*
 * class used for user data
 */
public class User {

    /*
     * unique id for each user
     */
    public static Integer id = 0;

    /*
     * first name of user
     */
    public String firstName;

    /*
     * family name of user
     */
    public String surname;

    /*
     * password created @ registration
     */
    public String password;

    /*
     * email used @ registration
     */
    public String email;

    /*
     * random generated string of 24 characters
     */
    public String iban;

    /*
     * -1 if user does not have a savings account
     * or id of created savings account
     */
    public Integer id_savings_account = -1;

    /*
     * base account created at registration
     * can be used for online or physical banking
     */
    public BaseAccount baseAccount;


    public User(String firstName, String surname, String password, String email) {
        id = id + 1;
        this.firstName = firstName;
        this.surname = surname;
        this.password = password;
        this.email = email;
        this.iban = "BNI" + RandomStringUtils.random(21, false, true);
        this.baseAccount = new BaseAccount(id, this.iban);
    }

    /*
     * getters used for database interrogation
     * --> check if user already exists
     */
    public static Integer getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    void openSavingsAccount() {
        this.baseAccount.openSavingsAccount();
        this.id_savings_account = SavingsAccount.savings_account_id;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", iban='" + iban + '\'' +
                ", id_savings_account=" + id_savings_account +
                ", baseAccount=" + baseAccount +
                '}';
    }
}
