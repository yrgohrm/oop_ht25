import java.util.*;

public class BankMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount account = new BankAccount();
        account.setAccount("34567899");

        System.out.println("Hur mycket vill du sätta in?");
        double money = scanner.nextDouble();
        
        if (!account.deposit(money)) {
            System.out.println("Insättning misslyckades.");
        }

        if (!account.withdraw(400)) {
            System.out.println("Uttag misslyckades.");
            System.out.println("Ditt saldo är endast " + account.getBalance());
        }

        System.out.println("Kontonummer:");
        System.out.println(account.getAccount());

        System.out.println("Saldo:");
        System.out.println(account.getBalance());


    }
}
