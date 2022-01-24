package day05;

public class TransferPerClient {
    private String clientId;
    private int sum;
    private int numberOfTransactions;

    public TransferPerClient(String clientId, int sum, int numberOfTransactions) {
        this.clientId = clientId;
        this.sum = sum;
        this.numberOfTransactions = numberOfTransactions;
    }

    public String getClientId() {
        return clientId;
    }

    public int getSum() {
        return sum;
    }

    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public void increase(int amount) {
        this.sum += amount;
        this.numberOfTransactions++;
    }

    public void decrease(int amount) {
        this.sum -= amount;
        this.numberOfTransactions++;
    }

    @Override
    public String toString() {
        return ", sum=" + sum +
                ", numberOfTransactions=" + numberOfTransactions +
                '}';
    }
}
