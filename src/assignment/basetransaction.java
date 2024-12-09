package assignment;

import Lecture4_interfaces_abstract_classes.TransactionInterface;
import Lecture4_interfaces_abstract_classes.BankAccount;
import java.util.Calendar;
import java.util.UUID;

public class BaseTransaction implements TransactionInterface {

    private double amount;
    private Calendar date;
    private String transactionID;

    public BaseTransaction(double amount, Calendar date) {
        this.amount = amount;
        this.date = (Calendar) date.clone();
        this.transactionID = UUID.randomUUID().toString();
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public Calendar getDate() {
        return (Calendar) date.clone();
    }

    @Override
    public String getTransactionID() {
        return transactionID;
    }

    public void printTransactionDetails() {
        System.out.println("Transaction ID: " + transactionID);
        System.out.println("Amount: " + amount);
        System.out.println("Date: " + date.getTime());
    }

    public void apply(BankAccount ba) throws InsufficientFundsException {
        System.out.println("Base transaction applied - no balance change");
    }
}
