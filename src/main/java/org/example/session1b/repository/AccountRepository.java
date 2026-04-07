package org.example.session1b.repository;

import org.example.session1b.entity.Account;

import java.util.*;

public class AccountRepository {

    private Map<String, Account> accounts = new HashMap<>();

    public void save(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }

    public Account find(String accNo) {
        return accounts.get(accNo);
    }

    public Map<String, Account> getAll() {
        return accounts;
    }
}
