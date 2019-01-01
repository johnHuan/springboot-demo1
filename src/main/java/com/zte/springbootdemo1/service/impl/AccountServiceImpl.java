package com.zte.springbootdemo1.service.impl;

import com.zte.springbootdemo1.dao.AccountMapper;
import com.zte.springbootdemo1.pojo.Account;
import com.zte.springbootdemo1.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountMapper accountMapper;
    @Override
    public Account getAccountById(int userId) {
        return accountMapper.selectByPrimaryKey(userId);
    }

    @Override
    public boolean addAccount(Account account) {
        boolean result = false;
        try {
            accountMapper.insertSelective(account);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
