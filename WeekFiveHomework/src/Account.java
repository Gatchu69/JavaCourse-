import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Account(){
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate / 1200;
    }

    public double getMonthlyInterest(double monthlyInterest){
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount){
        if (amount > 0 && balance >= amount) {
            this.balance -= amount;
        }
        else if(amount <= 0)
        {
            System.out.println("Withdraw amount cannot be zero or negative.");
        }
        else
        {
            System.out.println("Insufficient Balance to withdraw.");
        }
    }

    public void deposit(double amount){
        if (amount > 0) {
            this.balance += amount;
        }
        else
        {
            System.out.println("Deposit amount cannot be zero or negative.");
        }
    }
}
