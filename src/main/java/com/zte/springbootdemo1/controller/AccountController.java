package com.zte.springbootdemo1.controller;

import com.zte.springbootdemo1.pojo.Account;
import com.zte.springbootdemo1.service.AccountService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/springboot")
public class AccountController {

    @Resource
    private AccountService accountService;

    @RequestMapping("/account/{id}")
    @ResponseBody
    public Account toIndex(@PathVariable(name = "id") int id, Model model){
        int accountId = id;
        Account account = this.accountService.getAccountById(accountId);
        return account;
    }

}
