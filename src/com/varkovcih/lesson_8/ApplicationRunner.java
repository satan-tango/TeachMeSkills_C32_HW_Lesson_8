package com.varkovcih.lesson_8;

import com.varkovcih.lesson_8.document_parser.IParser;
import com.varkovcih.lesson_8.fabric.ParserFabric;
import com.varkovcih.lesson_8.model.account.Account;
import com.varkovcih.lesson_8.model.card.BaseCard;
import com.varkovcih.lesson_8.model.card.MasterCard;
import com.varkovcih.lesson_8.model.card.VisaCard;
import com.varkovcih.lesson_8.model.client.IndividualClient;
import com.varkovcih.lesson_8.model.document.Check;
import com.varkovcih.lesson_8.transfer.impl.MasterCardTransferService;
import com.varkovcih.lesson_8.transfer.impl.VisaCardTransferService;
import com.varkovcih.lesson_8.user_action.UserAction;

import java.util.Date;

public class ApplicationRunner {

    public static void main(String[] args) {
        // TODO запросить с консоли путь и имя файла

        // TODO сделать метод createParser статичным и избавиться от необходимости создания объекта parserFabric
        // TODO заменить "" на имя файла, полученное со сканера
        String filePath = UserAction.getFilePath();
        IParser parser = ParserFabric.createParser(filePath);
        parser.parseFile(filePath);
        System.out.println("===========================================================================");

        // TODO реализовать тестовый сценарий
        // создать двух клиентов
        // каждому клиенту создать два счета и две карты
        // перевести с карты одного клиента на карту другого сумму денег
        // перевести с карты одного клинента на счет другого клиента сумму денег

        IndividualClient firstClient = new IndividualClient(
                "Dmitry",
                new Account[]{new Account("IMKD23324234", 55.3),
                        new Account("IMKD2211214", 23)},
                new BaseCard[]{
                        new MasterCard("4344-3242-3434-1111", 322, new Date(2029, 12, 1)
                                , "Dmitry Varkovich", "BLR", 233, "Belarus"),
                        new VisaCard("1240-1241-6666-1141", 669, new Date(2025, 5, 10)
                                , "Dmitry Varkovich", "BLR", 10, 3)},
                "KH5431266");
        IndividualClient secondClient = new IndividualClient(
                "Pavel",
                new Account[]{new Account("IMKD32224234", 0),
                        new Account("IMKD124141241", 500)},
                new BaseCard[]{
                        new MasterCard("5555-1231-0000-1241", 432, new Date(2024, 3, 1)
                                , "Pavel Shevich", "BLR", 100, "Belarus"),
                        new VisaCard("3233-1324-1215-5543", 211, new Date(2030, 1, 3)
                                , "Pavel Shevich", "BLR", 21, 2)},
                "KH5431266");

        MasterCardTransferService masterCardTransferService = new MasterCardTransferService();
        VisaCardTransferService visaCardTransferService = new VisaCardTransferService();

        Check firstTransaction = masterCardTransferService.
                transferFromCardToCard(firstClient.cards[0], secondClient.cards[0], 55);
        Check secondTransaction = visaCardTransferService.
                transferFromCardToAccount(secondClient.cards[1], firstClient.accounts[0], 10.2);

        if (firstTransaction != null) {
            firstTransaction.showInformationAboutCheck();
            System.out.println();
            System.out.println();

        }
        if (secondTransaction != null) {
            secondTransaction.showInformationAboutCheck();
            System.out.println();
            System.out.println();
        }
    }

}
