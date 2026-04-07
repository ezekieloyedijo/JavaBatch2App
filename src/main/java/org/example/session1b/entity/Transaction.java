package org.example.session1b.entity;

import java.util.Objects;

public class Transaction {
    private String id;
    private double amount;

    public Transaction(String id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public String getId() { return id; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transaction)) return false;
        Transaction t = (Transaction) o;
        return id.equals(t.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}