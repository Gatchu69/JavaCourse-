import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    public Account(){
        Date dateCreated = new Date();
    }

    public Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate / 1200;

    }

    public double getMonthlyInterest(){
       return balance * getMonthlyInterestRate();
    }
    public double withdraw(double amount){
        if(balance >= amount) {
            return balance -= amount;
        } else {
            System.out.println("You don't have enough money on your account");
            return balance;
        }
    }

    public void deposit(int amount){
        balance += amount;
    }
}
