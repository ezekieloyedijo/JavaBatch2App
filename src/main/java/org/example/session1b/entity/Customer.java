package org.example.session1b.entity;

import java.util.HashSet;
import java.util.Set;

public class Customer {
    private String id;
    private Set<Account> accounts = new HashSet<>();

    public Customer(String id) {
        this.id = id;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Set<Account> getAccounts() {
        return accounts;
    }
}
