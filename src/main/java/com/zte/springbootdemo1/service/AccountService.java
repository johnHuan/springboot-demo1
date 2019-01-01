package com.zte.springbootdemo1.service;

import com.zte.springbootdemo1.pojo.Account;

public interface AccountService {

    public Account getAccountById(int userId);

    boolean addAccount(Account account);
}
