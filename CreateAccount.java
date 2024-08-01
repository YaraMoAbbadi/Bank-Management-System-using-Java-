package BankManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateAccount {
	public CreateAccount (Scanner scanner, int lastAccId, ArrayList<Account> accounts, Database database) {
		System.out.println("Enter your first name: ");
        String firstName = scanner.next();
        System.out.println("Enter your last name: ");
        String lastName = scanner.next();
        System.out.println("Enter your balance: ");
        double balance = scanner.nextDouble();
        System.out.println("Enter your passcode: ");
        int passcode = scanner.nextInt();
        System.out.println("Confirm passcode: ");
        int passcodeConfirm = scanner.nextInt();

        if (passcode != passcodeConfirm) {
            System.out.println("Passcodes do not match!\n");
            return;
        }

        int id = 1000000 + lastAccId;
        lastAccId++;
        Account acc = new Account(firstName, lastName, id, balance, passcode);
        System.out.println("Your account id: " + id);
        accounts.add(acc);
        new Menu(scanner, acc, database, accounts);
    }
	}

