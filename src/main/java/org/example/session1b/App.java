package org.example.session1b;


import org.example.session1b.entity.Account;
import org.example.session1b.entity.Transaction;
import org.example.session1b.repository.AccountRepository;
import org.example.session1b.service.BankService;

public class App {
    public static void main(String[] args) {

        AccountRepository repo = new AccountRepository();

        Account acc = new Account("A1");
        repo.save(acc);

        BankService service = new BankService(repo.getAll());

        Transaction t1 = new Transaction("T1", 100);
        Transaction t2 = new Transaction("T2", 200);

        service.addTransaction("A1", t1);
        service.addTransaction("A1", t2);

        System.out.println(acc.getTransactions().size());
    }
}
