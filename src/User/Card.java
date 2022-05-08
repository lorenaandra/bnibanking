package User;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class Card {

    /*
     * unique card number
     */
    public String card_number;

    /*
     * cvv
     */
    public String cvv;

    /*
     * user id
     */
    public Integer userId;

    /*
     * expiration date
     */
    public Integer expirationDate;

    /*
     * iban from base account
     */
    public String iban_base_account;

    /*
     * is or not default set card
     */
    public boolean isDefault;


    public Card(String card_number, Integer userId, String iban_base_account, boolean isDefault) {
        this.card_number = card_number;
        this.cvv = RandomStringUtils.random(3, false, true);
        this.userId = userId;
        generateDate();
        this.iban_base_account = iban_base_account;
        this.isDefault = isDefault;
    }

    public Card(Integer userId, String iban_base_account, boolean isDefault) {
        this.card_number = RandomStringUtils.random(24, false, true);
        this.cvv = RandomStringUtils.random(3, false, true);
        this.userId = userId;
        generateDate();
        this.iban_base_account = iban_base_account;
        this.isDefault = isDefault;
    }

    public void generateDate() {
        Integer date;
        Random rand = new Random();
        Integer mon, d;
        String year = "", month = "", day = "";

        year = "202" + (rand.nextInt(6) + 3);
        mon = rand.nextInt(11) + 1;
        if (mon <= 9) {
            month = "0" + mon;
        } else {
            month = String.valueOf(mon);
        }
        d = rand.nextInt(30) + 1;
        if (d <= 9) {
            day = "0" + d;
        } else {
            day = String.valueOf(d);
        }

        date = Integer.parseInt(year + month + day);
        this.expirationDate = date;
    }

    @Override
    public String toString() {
        return "\n\nCard{" +
                "card_number='" + card_number + '\'' +
                ", cvv='" + cvv + '\'' +
                ", userId=" + userId +
                ", expirationDate=" + expirationDate +
                ", iban_base_account='" + iban_base_account + '\'' +
                ", isDefault=" + isDefault +
                '}';
    }
}
