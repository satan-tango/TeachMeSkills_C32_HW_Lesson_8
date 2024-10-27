package com.varkovcih.lesson_8.task_1.model.client;

import com.varkovcih.lesson_8.task_1.model.account.Account;
import com.varkovcih.lesson_8.task_1.model.card.BaseCard;

public class LegalClient extends BaseClient {

    String legalClientNumber;

    public LegalClient(String name, Account[] accounts, BaseCard[] cards, String legalClientNumber) {
        super(name, accounts, cards);
        this.legalClientNumber = legalClientNumber;
    }
}
