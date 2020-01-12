package entity;

public class Account {

    private int number;
        public int getNumber() {
            return this.number;
        }

    public String holder;

    private double balance;
        public double getBalance() {
            return this.balance;
        }

        public void deposit(double deposit) {
            this.balance += deposit;
        }

        public void witdraw(double witdraw) {
            this.balance -= witdraw + 5;
        }

    public Account(int number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public String toString() {
        return String.format("Account %d, Holder: %s, Balance: $ %.2f", getNumber(), this.holder, getBalance());
    }


}