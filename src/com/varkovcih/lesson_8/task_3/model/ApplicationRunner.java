package com.varkovcih.lesson_8.task_3.model;

import com.varkovcih.lesson_8.task_3.model.patient.Patient;

/**
 * Создать программу для имитации работы клиники. Пусть в клинике будет три врача:
 * хирург, терапевт и дантист. Каждый врач имеет метод «лечить», но каждый врач лечит
 * по-своему. Так же предусмотреть класс «Пациент» с полем «План лечения» и полем
 * «Доктор». Создать объект класса «Пациент» и добавить пациенту план лечения. У
 * терапевта создать метод, который будет назначать врача пациенту согласно плану
 * лечения:
 * Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
 * Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
 * Если план лечения имеет любой другой код – назначить терапевта и выполнить метод
 * лечить.
 */
public class ApplicationRunner {

    public static void main(String[] args) {
        Patient firstPatient = new Patient(1);
        Patient secondPatient = new Patient(3);
        firstPatient.getDoctor().treatAPatient();
        secondPatient.getDoctor().treatAPatient();
    }
}
