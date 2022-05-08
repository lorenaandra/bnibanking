package User;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class Card {

    public String card_number;

    public String cvv;

    public Integer userId;

    public String expirationDate;

    public String iban_base_account;

    public boolean isDefault;


    public Card(String card_number, Integer userId, String iban_base_account, boolean isDefault) {
        this.card_number = card_number;
        this.cvv = RandomStringUtils.random(3, false, true);
        this.userId = userId;
        Random rand = new Random();
        this.expirationDate = "202" + (rand.nextInt(9 - 3 + 1) + 3) + (rand.nextInt(12 - 1 + 1) + 1) + (rand.nextInt(31 - 1 + 1) + 1);
        this.iban_base_account = iban_base_account;
        this.isDefault = isDefault;
    }

    public Card(Integer userId, String iban_base_account, boolean isDefault) {
        this.card_number = RandomStringUtils.random(24, false, true);
        this.cvv = RandomStringUtils.random(3, false, true);
        this.userId = userId;
        Random rand = new Random();
        this.expirationDate = "202" + (rand.nextInt(9 - 3 + 1) + 3) + (rand.nextInt(12 - 1 + 1) + 1) + (rand.nextInt(31 - 1 + 1) + 1);;
        this.iban_base_account = iban_base_account;
        this.isDefault = isDefault;
    }

}
