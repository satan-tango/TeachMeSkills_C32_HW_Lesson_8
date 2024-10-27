package com.varkovcih.lesson_8.task_1.model.client;

import com.varkovcih.lesson_8.task_1.model.account.Account;
import com.varkovcih.lesson_8.task_1.model.card.BaseCard;

public class IndividualClient extends BaseClient {

    String passportNumber;

    public IndividualClient(String name, Account[] accounts, BaseCard[] cards, String passportNumber) {
        super(name, accounts, cards);
        this.passportNumber = passportNumber;
    }
}
