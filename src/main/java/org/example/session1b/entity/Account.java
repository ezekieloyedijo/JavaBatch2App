package org.example.session1b.entity;

import java.util.*;

public class Account {
    private String accountNumber;
    private List<Transaction> transactions = new ArrayList<>();

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() { return accountNumber; }

    public void addTransaction(Transaction t) {
        if (!transactions.contains(t)) {
            transactions.add(t);
        }
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
