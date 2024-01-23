package anudip;

import java.util.Scanner;

public class BankAccount {
	
	    private double balance;

	 
	    public BankAccount(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    // Method to deposit 
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposit successful. New balance: " + balance);
	        } else {
	            System.out.println("Invalid amount,must be greater than 0.");
	        }
	    }
	   // Method to withdraw  
	    public void withdraw(double amount) {
	        try {
	            if (amount > 0) {
	                if (amount <= balance) {
	                    balance -= amount;
	                    System.out.println("Withdrawal successful. New balance: " + balance);
	                } else {
	                    throw new IllegalArgumentException("Amount exceeds balance.");
	                }
	            } else {
	                throw new IllegalArgumentException("Invalid amount enter amount greater than 0.");
	            }
	        } catch (IllegalArgumentException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }

	    // current balance
	    public double getBalance() {
	        return balance;
	    }
	

	    public static void main(String[] args) {
	        //  initial balance of 1000
	        BankAccount account = new BankAccount(1000);

	       
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Initial Balance: " + account.getBalance());

	        // Deposit
	        System.out.print("Enter deposit amount: ");
	        double depositAmount = scanner.nextDouble();
	        account.deposit(depositAmount);

	        // Withdraw
	        System.out.print("Enter withdrawal amount: ");
	        double withdrawalAmount = scanner.nextDouble();
	        account.withdraw(withdrawalAmount);

	      
	    }
	}



OUTPUT:
Initial Balance: 1000.0
Enter deposit amount: 500
Deposit successful. New balance: 1500.0
Enter withdrawal amount: 1200
Withdrawal successful. New balance: 300.0
=============================================
Initial Balance: 1000.0
Enter deposit amount: 500
Deposit successful. New balance: 1500.0
Enter withdrawal amount: 2000
Error: Amount exceeds balance.
===============================================
Initial Balance: 1000.0
Enter deposit amount: 100
Deposit successful. New balance: 1100.0
Enter withdrawal amount: -1000
Error: Invalid amount enter amount greater than 0.