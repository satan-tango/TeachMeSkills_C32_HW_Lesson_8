package com.varkovcih.lesson_8.model.document;

import java.util.Arrays;
import java.util.Date;
import java.util.stream.Collectors;

// TODO добавить поля: сумма перевода, дата перевода, номер счета или номер карты
// TODO создать метод для вывода информации о чеке на экран
public class Check {

    public double transferAmount;
    Date transferdate;
    String senderInformation;

    public Check(double transferAmount, Date transferdate, String senderInformation) {
        this.transferAmount = transferAmount;
        this.transferdate = transferdate;
        this.senderInformation = senderInformation;
    }

    public void showInformationAboutCheck() {
        System.out.printf("Check\nDate: %tD %tT\nSender: %s\n---------------\nAmount: %.2f",
                transferdate, transferdate, getEncryptedSenderInformation(), transferAmount);
    }

    private String getEncryptedSenderInformation() {
        String[] array = senderInformation.split("");

        for (int i = 0; i < array.length; i++) {
            if (i == 0 || i == 1 || i == array.length - 1 || i == array.length - 2) {
                continue;
            }
            array[i] = "*";
        }

        return Arrays.stream(array)
                .collect(Collectors.joining());
    }
}
