package BankManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner;
    static int lastAccId = 0;
    private static ArrayList<Account> accounts;

    public static void main(String[] args) {
        accounts = new ArrayList<>();
        scanner = new Scanner(System.in);
        Database database = new Database();
        accounts = database.getAccounts();
        lastAccId = accounts.size();
       
            System.out.println("Welcome to the bank management system!");
            System.out.println("1. Create new account");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            int i=scanner.nextInt();
            

            switch (i) {
                case 1:
                    new CreateAccount(scanner, lastAccId++, accounts, database);
                    break;
                case 2:
                    new Login(scanner, accounts, database);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        while (i != 3);
    }
}
