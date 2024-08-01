package BankManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    public Login(Scanner scanner, ArrayList<Account> accounts, Database database) {
        System.out.println("Enter account id: ");
        int id = scanner.nextInt();
        System.out.println("Enter your passcode: ");
        int passcode = scanner.nextInt();

        Account account = null;
        boolean exists = false;

        for (Account acc : accounts) {
            if (acc.getAccId() == id && acc.getPasscode() == passcode) {
                exists = true;
                account = acc;
                break;
            }
        }

        if (exists) {
            new Menu(scanner, account, database, accounts);
        } else {
            System.out.println("Account doesn't exist!");
        }
    }
}
