package se.bilting;



public class Account {

    private final int number;  // 3 fields (Javas officiella namn)
    private int balance; // member variables (C++)
    private final String name; // instance variables

    private static int nAccounts; // gemensam för alla Account-objekt
                                  // tillhör INTE något Account-objekt

    public final static int clearingNumber = 9812;


    //konstruktor
    public Account(String name) {
        if (name == null || name.isBlank()) { // förtitt på exceptions
            throw new IllegalArgumentException("Name must not be null or blank");
        }
        this.name = name;
        balance = 0;
        nAccounts++;
        number = nAccounts;
    }

    public Account() {
        this("Anonymous");
//        this.name = "Anonymous";
//        balance = 0;
//        nAccounts++;
//        number = nAccounts;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("deposit: amount must be > 0, ignored");
        } else {
            balance += amount;
        }
    }

    public void withdraw(int amount){
        if (amount <= 0 || amount > balance){
            System.out.println("withdraw: Illegal amount:"+ amount);
        } else {
            balance -= amount;
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", balance=" + balance +
                ", name='" + name + '\'' +
                '}';
    }

    public int getBalance() {
        return balance;
    }

    public static int getNumberOfAccounts() { // kan anropas UTAN objekt
        return nAccounts; // ser bara static data medlemmar fields
    }
}
