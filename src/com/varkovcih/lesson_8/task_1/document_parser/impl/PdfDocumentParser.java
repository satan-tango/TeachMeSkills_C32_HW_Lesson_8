package com.varkovcih.lesson_8.task_1.document_parser.impl;

import com.varkovcih.lesson_8.task_1.document_parser.IParser;

public class PdfDocumentParser implements IParser {

    @Override
    public void parseFile(String fileName) {
        System.out.println("Получить данные из pdf документ");
    }

}
