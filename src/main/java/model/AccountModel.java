package model;

import entity.Account;

import java.util.List;

public interface AccountModel {
    boolean save(Account account);
    boolean update(int id, Account accountUpdate);
    boolean delete(int id);
    List<Account>findAll();
}
