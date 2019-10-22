package com.ibm.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.ibm.bean.Transaction;
import com.ibm.service.AccountManagementService;
import com.ibm.service.TransactionManagementService;

public class Main {
	static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		boolean shouldRefresh = true;
		Main runner = new Main();

		long uiInput, userInput, accountNumber, phoneNumber = 0;
		String name, address;

		do {
			System.out.println("Welcome to XYZ Bank Wallet");
			System.out.println("1. Enter Account Number 2. Create a new Account 3. Exit");
			uiInput = scan.nextInt();
			scan.nextLine();
			if (uiInput == 1) {
				System.out.println("Account Number: ");
				accountNumber = scan.nextLong();
				scan.nextLine();
				if (runner.checkAccount(accountNumber)) {
					System.out.println(
							"1. Deposit 2. Withdraw 3. Show Balance 4. Transfer Funds 5. Show All Transactions 6. Exit");
					userInput = scan.nextInt();
					scan.nextLine();
					switch ((int) userInput) {
					case 1:
						runner.deposit(accountNumber);
						break;
					case 2:
						runner.withdraw(accountNumber);
						break;
					case 3:
						runner.showBalance(accountNumber);
						break;
					case 4:
						runner.transfer(accountNumber);
						break;
					case 5:
						runner.showAllTransactions(accountNumber);
						break;
					case 6:
						shouldRefresh = false;
						break;
					default:
						break;
					}
				} else {
					System.out.println("Invalid Account!!!");
				}
			}
			if (uiInput == 2) {
				System.out.println("Enter Your Details");
				System.out.print("Name: ");
				name = scan.nextLine();
				System.out.print("Address: ");
				address = scan.nextLine();
				boolean phoneCheck = true;
				while (phoneCheck) {
					System.out.print("Phone Number: ");
					phoneNumber = scan.nextLong();
					if (((Long) phoneNumber).toString().length() == 10) {
						phoneCheck = false;
					} else {
						System.out.println("Invalid length!! must be 10 digits!!");
					}
				}
				System.out.println("Message: ");
				System.out.println(new AccountManagementService().createAccount(name, phoneNumber, address));
			}
			if (uiInput == 3) {
				shouldRefresh = false;
			}
			scan.hasNextLine();
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		} while (shouldRefresh);

		scan.close();
	}

	private boolean checkAccount(long accountNumber) {
		return new AccountManagementService().isAnAccount(accountNumber);
	}

	private void showAllTransactions(long accountNumber) {
		ArrayList<Transaction> transactions = new AccountManagementService().getTransactions(accountNumber);
		if (transactions == null) {
			System.out.println("Can't fetch or no Transactions!!");
		} else {
			for (Transaction transaction : transactions) {
				System.out.println("------------------------");
				System.out.println(
						"Transaction ID: " + transaction.getTransactionId() + "\nDate: " + transaction.getDate()
								+ "\nType: " + transaction.getType() + "\nAmount: " + transaction.getAmount());
				System.out.println("------------------------");
			}
		}
	}

	private void transfer(long accountNumber) {
		long amount = 0;
		long trgtAccountNumber = 0;

		System.out.println("Amount: ");
		amount = scan.nextLong();
		scan.nextLine();
		System.out.println("Reciever's Account Number: ");
		trgtAccountNumber = scan.nextLong();
		scan.nextLine();
		System.out.println("Message: ");
		System.out.println(new TransactionManagementService().fundTransfer(accountNumber, trgtAccountNumber, amount));

	}

	private void showBalance(long accountNumber) {
		long balance = new AccountManagementService().getBalance(accountNumber);
		if (balance == -1) {
			System.out.println("Can't connect to Server!!");
		} else {
			System.out.println("Account Balance: " + balance);
		}
	}

	private void withdraw(long accountNumber) {
		long amount = 0;

		System.out.println("Amount: ");
		amount = scan.nextLong();
		scan.nextLine();
		System.out.println("Message: ");
		System.out.println(new TransactionManagementService().withdrawAmount(accountNumber, amount));

	}

	private void deposit(long accountNumber) {
		long amount = 0;

		System.out.println("Amount: ");
		amount = scan.nextLong();
		scan.nextLine();
		System.out.println("Message: ");
		System.out.println(new TransactionManagementService().depositAmount(accountNumber, amount));
	}

}
