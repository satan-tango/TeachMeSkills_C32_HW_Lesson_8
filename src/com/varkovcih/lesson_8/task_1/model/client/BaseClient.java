package com.varkovcih.lesson_8.task_1.model.client;

import com.varkovcih.lesson_8.task_1.model.account.Account;
import com.varkovcih.lesson_8.task_1.model.card.BaseCard;

public abstract class BaseClient {

    public String name;
    public Account[] accounts;
    public BaseCard[] cards;

    public BaseClient(String name, Account[] accounts, BaseCard[] cards) {
        this.name = name;
        this.accounts = accounts;
        this.cards = cards;
    }
}
