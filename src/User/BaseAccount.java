package User;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;

public class BaseAccount {

    /*
     * unique iban generated at user registration
     */
    public String iban;

    /*
     * user id
     */
    public Integer user_id;

    /*
     * user's current sold
     */
    public Float sold;

    /*
     * user can have multiple cards
     */
    public Integer numberOfCards;

    /*
     * array of user's card numbers
     */
    public ArrayList<Card> cards;

    /*
     * main card associated with bank account
     */
    public String mainCardNumber;

    /*
     * boolean that checks if user has savings account
     */
    public Boolean hasSavingsAccount;

    /*
     * number of transfers completed by user
     */
    public Integer numberOfTransfers;

    /*
     * id of each completed transfer
     */
    public ArrayList<Integer> idTransfers;


    public BaseAccount(Integer user_id, String iban) {
        this.user_id = user_id;
        this.iban = iban;
        this.sold = 0.f;
        this.numberOfCards = 1;
        this.cards = new ArrayList<>();
        this.mainCardNumber = RandomStringUtils.random(24, false, true);
        Card mainCard = new Card(this.mainCardNumber, this.user_id, this.iban, true);
        this.cards.add(mainCard);
        this.hasSavingsAccount = false;
        this.numberOfTransfers = 0;
        this.idTransfers = new ArrayList<>();
    }


    /*
     * getters used at sold interrogation
     */
    public Float getSold() {
        return sold;
    }

    public String getIban() {
        return iban;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public Integer getNumberOfCards() {
        return numberOfCards;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public String getMainCardNumber() {
        return mainCardNumber;
    }

    public Boolean getHasSavingsAccount() {
        return hasSavingsAccount;
    }

    public Integer getNumberOfTransfers() {
        return numberOfTransfers;
    }

    public ArrayList<Integer> getIdTransfers() {
        return idTransfers;
    }


    /*
     * setters used for user operations
     */
    public void setSold(Float sold) {
        this.sold = sold;
    }

    public void setNumberOfCards(Integer numberOfCards) {
        this.numberOfCards = numberOfCards;
    }

    public void setCardNumbers(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public void setMainCardNumber(String mainCardNumber) {
        this.mainCardNumber = mainCardNumber;
    }

    public void setHasSavingsAccount(Boolean hasSavingsAccount) {
        this.hasSavingsAccount = hasSavingsAccount;
    }

    public void setNumberOfTransfers(Integer numberOfTransfers) {
        this.numberOfTransfers = numberOfTransfers;
    }

    public void setIdTransfers(ArrayList<Integer> idTransfers) {
        this.idTransfers = idTransfers;
    }

    @Override
    public String toString() {
        return "\n\nBaseAccount{" +
                "iban='" + iban + '\'' +
                ", user_id=" + user_id +
                ", sold=" + sold +
                ", numberOfCards=" + numberOfCards +
                ", cards=" + cards +
                ", mainCardNumber='" + mainCardNumber + '\'' +
                ", hasSavingsAccount=" + hasSavingsAccount +
                ", numberOfTransfers=" + numberOfTransfers +
                ", idTransfers=" + idTransfers +
                '}';
    }
}
