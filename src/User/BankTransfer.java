package User;

public class BankTransfer {

    public static Integer transfer_id = 0;

    public Integer sender_user_id;

    public Integer date;

    public Double sum;

    public String iban_base_account;

    public Integer recipient_user_id;

    public String transferDescription;

    public BankTransfer(Integer sender_user_id, Integer date, Double sum, String iban_base_account,
                        Integer recipient_user_id, String transferDescription) {
        this.sender_user_id = sender_user_id;
        this.date = date;
        this.sum = sum;
        this.iban_base_account = iban_base_account;
        this.recipient_user_id = recipient_user_id;
        this.transferDescription = transferDescription;
    }

    @Override
    public String toString() {
        return "\n\nBankTransfer{" +
                "transfer_id=" + transfer_id +
                "sender_user_id=" + sender_user_id +
                ", date=" + date +
                ", sum=" + sum +
                ", iban_base_account='" + iban_base_account + '\'' +
                ", recipient_user_id=" + recipient_user_id +
                '}';
    }
}
