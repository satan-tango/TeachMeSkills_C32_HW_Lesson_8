package com.varkovcih.lesson_8.task_1.fabric;

import com.varkovcih.lesson_8.task_1.document_parser.IParser;
import com.varkovcih.lesson_8.task_1.document_parser.impl.DocxDocumentParser;
import com.varkovcih.lesson_8.task_1.document_parser.impl.PdfDocumentParser;
import com.varkovcih.lesson_8.task_1.document_parser.impl.TxtDocumentParser;

public class ParserFabric {

    public static IParser createParser(String fileName) {
    /*    if (fileName.endsWith(".docx")) {
            // TODO избавиться от return null и сделать возврат docx парсера
            return new DocxDocumentParser();
        } else if (fileName.endsWith(".pdf")) {
            return new PdfDocumentParser();
        } else {
            return new TxtDocumentParser();
        }

    */
        String extension = fileName.split("\\.")[1];
        switch (extension) {
            case "docx" -> {
                return new DocxDocumentParser();
            }
            case "pdf" -> {
                return new PdfDocumentParser();
            }
            default -> {
                return new TxtDocumentParser();
            }
        }


        // TODO (опционально) * попробовать переписать на конструкцию switch-case, может это будет более ёмкая запись
    }

}
