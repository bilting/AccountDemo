package se.bilting;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        System.out.println("Antal konton: " + Account.getNumberOfAccounts());

        Account a1 = new Account("Ulf");

        a1.deposit(100);

        System.out.println(a1.getBalance()); // Objekt-metod,  instans-metod

        Account a2 = new Account();
        a2.deposit(200);
        a2.withdraw(150);

        System.out.println("Antal konton: " + Account.getNumberOfAccounts());
                                              // statisk metod, klass-metod
        System.out.println("Clearing number " + Account.clearingNumber);

        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
}
