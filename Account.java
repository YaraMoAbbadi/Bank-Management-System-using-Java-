package BankManagementSystem;

public class Account {
    private String firstName;
    private String lastName;
    private int accId;
    private double balance;
    private int passcode;

    public Account(String firstName, String lastName, int accId, double balance, int passcode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accId = accId;
        this.balance = balance;
        this.passcode = passcode;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAccId() {
        return accId;
    }

    public double getBalance() {
        return balance;
    }

    public int getPasscode() {
        return passcode;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

	public void setBalance(double d) {
		
	}

	public void setFirstName(String string) {
		
	}

	public void setAccId(int int1) {
		
	}

	public void setPasscode(int int1) {
		
	}

	public void setLastName(String string) {
		
	}
}
