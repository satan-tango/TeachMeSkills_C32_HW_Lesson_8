package com.varkovcih.lesson_8.task_3.model.doctor.impl;

import com.varkovcih.lesson_8.task_3.model.doctor.DoctorOperation;

public class Dentist implements DoctorOperation {

    @Override
    public void treatAPatient() {
        System.out.println("The dentist treats");
    }
}
