package org.example.session1b.service;

import org.example.session1b.entity.Account;
import org.example.session1b.entity.Transaction;

import java.util.*;

public class BankService {

    private Map<String, Account> accounts;

    public BankService(Map<String, Account> accounts) {
        this.accounts = accounts;
    }

    public void addTransaction(String accNo, Transaction t) {
        Account acc = accounts.get(accNo);
        if (acc != null) {
            acc.addTransaction(t);
        }
    }
}
