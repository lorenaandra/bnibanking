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
    public Double sold;

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
    public Card mainCard;

    /*
     * boolean that checks if user has savings account
     */
    public Boolean hasSavingsAccount;

    /*
     * user's savings account
     * can be null
     */
    public SavingsAccount savingsAccount;

    /*
     * number of transfers completed by user
     */
    public Integer numberOfTransfers;

    /*
     * each completed transfer
     */
    public ArrayList<BankTransfer> transfers;


    public BaseAccount(Integer user_id, String iban) {
        this.user_id = user_id;
        this.iban = iban;
        this.sold = 0.00;
        this.numberOfCards = 1;
        this.cards = new ArrayList<>();
        this.mainCard = new Card(RandomStringUtils.random(24, false, true), this.user_id, this.iban, true);
        this.cards.add(this.mainCard);
        this.hasSavingsAccount = false;
        numberOfTransfers = 0;
        this.transfers = new ArrayList<>();
    }

    /*
     * call this method from user only
     */
    void openSavingsAccount() {
        this.hasSavingsAccount = true;
        this.savingsAccount = new SavingsAccount(this.iban, this.user_id);
    }

    /*
     * create a transfer
     */
    void createTransfer(Integer sender_user_id, Integer date, Double sum, Integer recipient_user_id, String transferDescription) {
        incrementNumberOfTransfers(getNumberOfTransfers());
        this.transfers.add(new BankTransfer(sender_user_id, date, sum, this.iban, recipient_user_id, transferDescription));
    }

    /*
     * getters used at sold interrogation
     */
    public Double getSold() {
        return sold;
    }

    public String getIban() {
        return iban;
    }

    public Integer getNumberOfCards() {
        return numberOfCards;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public Card getMainCard() {
        return mainCard;
    }

    public Boolean getHasSavingsAccount() {
        return hasSavingsAccount;
    }

    public Integer getNumberOfTransfers() {
        return numberOfTransfers;
    }

    public ArrayList<BankTransfer> getTransfers() {
        return transfers;
    }

    /*
     * setters used for user operations
     */
    public void setSold(Double sold) {
        this.sold = sold;
    }

    public void setCardNumbers(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public void setMainCard(Card mainCard) {
        this.mainCard = mainCard;
    }

    public void setHasSavingsAccount(Boolean hasSavingsAccount) {
        this.hasSavingsAccount = hasSavingsAccount;
    }

    public void incrementNumberOfTransfers(Integer numberOfTransfers) {
        this.numberOfTransfers = getNumberOfTransfers() + 1;
    }

    public void incrementNumberOfCards() {
        this.numberOfCards = getNumberOfCards() + 1;
    }

    @Override
    public String toString() {
        return "\n\nBaseAccount{" +
                "iban='" + iban + '\'' +
                ", user_id=" + user_id +
                ", sold=" + sold +
                ", numberOfCards=" + numberOfCards +
                ", cards=" + cards +
                ", mainCard=" + mainCard +
                ", hasSavingsAccount=" + hasSavingsAccount +
                ", savingsAccount=" + savingsAccount +
                ", numberOfTransfers=" + numberOfTransfers +
                ", transfers=" + transfers +
                '}';
    }
}
