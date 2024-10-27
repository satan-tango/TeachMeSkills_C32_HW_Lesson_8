package com.varkovcih.lesson_8.task_1.transfer.impl;

import com.varkovcih.lesson_8.task_1.model.account.Account;
import com.varkovcih.lesson_8.task_1.model.card.BaseCard;
import com.varkovcih.lesson_8.task_1.model.card.MasterCard;
import com.varkovcih.lesson_8.task_1.model.document.Check;
import com.varkovcih.lesson_8.task_1.transfer.CardTransferService;

import java.util.Date;

// TODO реализовать имплементацию интерфейса
public class MasterCardTransferService implements CardTransferService {
    @Override
    public Check transferFromCardToCard(BaseCard cardFrom, BaseCard cardTo, double transferAmount) {
        if (!isCardSuitableForTransfer(cardFrom, transferAmount)) {
            return null;
        }

        cardFrom.amount -= transferAmount;
        cardTo.amount += transferAmount;

        return new Check(transferAmount, new Date(), cardFrom.cardNumber);
    }

    @Override
    public Check transferFromCardToAccount(BaseCard card, Account account, double transferAmount) {
        if (!isCardSuitableForTransfer(card, transferAmount)) {
            return null;
        }

        card.amount -= transferAmount;
        account.amount += transferAmount;

        return new Check(transferAmount, new Date(), card.cardNumber);
    }


    @Override
    public boolean isCardSuitableForTransfer(BaseCard card, double transferAmount) {
        if (!(card instanceof MasterCard)) {
            System.out.println("This is not a master card");
            return false;
        }
        return CardTransferService.super.isCardSuitableForTransfer(card, transferAmount);
    }
}
