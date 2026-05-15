package interf.models;

public class CreditRequest {

    private String clientName;

    private int salary;

    private boolean hasDebts;

    private int creditScore;

    public CreditRequest(String clientName,
                         int salary,
                         boolean hasDebts,
                         int creditScore) {

        this.clientName = clientName;
        this.salary = salary;
        this.hasDebts = hasDebts;
        this.creditScore = creditScore;
    }

    public String getClientName() {
        return clientName;
    }

    public int getSalary() {
        return salary;
    }

    public boolean hasDebts() {
        return hasDebts;
    }

    public int getCreditScore() {
        return creditScore;
    }
}
