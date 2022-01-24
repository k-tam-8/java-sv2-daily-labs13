package day05;

public class TransferClient {
    private String senderId;
    private String getId;
    private int amount;

    public TransferClient(String senderId, String getId, int amount) {
        this.senderId = senderId;
        this.getId = getId;
        this.amount = amount;
    }

    public String getSenderId() {
        return senderId;
    }

    public String getGetId() {
        return getId;
    }

    public int getAmount() {
        return amount;
    }
}
