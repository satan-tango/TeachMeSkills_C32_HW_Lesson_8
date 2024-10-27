package com.varkovcih.lesson_8.transfer;

import com.varkovcih.lesson_8.model.account.Account;
import com.varkovcih.lesson_8.model.card.BaseCard;
import com.varkovcih.lesson_8.model.document.Check;

public interface CardTransferService {

    // TODO сделать возвращаемое значение Check (класс лежит в пакете document)
    // TODO добавить входные параметры в метод: карта с..., карта на..., сумма трансфера
    Check transferFromCardToCard(BaseCard cardFrom, BaseCard cardTo, double transferAmount);

    // TODO сделать возвращаемое значение Check (класс лежит в пакете document)
    // TODO добавить входные параметры в метод: карта с.., счет на..., сумма трансфера
    Check transferFromCardToAccount(BaseCard card, Account account, double transferAmount);

     default boolean isCardSuitableForTransfer(BaseCard card, double transferAmount) {
        if (!card.checkIfThereIsEnoughMoneyToTransfer(transferAmount)) {
            System.out.println("There is no enough money on the card");
            return false;
        }

        if (!card.checkCardLimitTransfer(transferAmount)) {
            System.out.printf("The transfer amount is too high");
            return false;
        }

        return true;
    }

}
