package com.varkovcih.lesson_8.task_3.model.doctor.impl;

import com.varkovcih.lesson_8.task_3.model.doctor.DoctorOperation;

public class Therapist implements DoctorOperation {

    @Override
    public void treatAPatient() {
        System.out.println("The therapist treats");
    }

    public static DoctorOperation appointADoctor(int treatPlan) {
        switch (treatPlan) {
            case 1 -> {
                return new Surgeon();
            }
            case 2 -> {
                return new Dentist();
            }
            default -> {
                return new Therapist();
            }
        }
    }
}
