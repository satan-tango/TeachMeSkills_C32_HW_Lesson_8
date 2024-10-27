package com.varkovcih.lesson_8.task_3.model.patient;

import com.varkovcih.lesson_8.task_3.model.doctor.DoctorOperation;
import com.varkovcih.lesson_8.task_3.model.doctor.impl.Therapist;

public class Patient {

    private int treatPlan;
    private DoctorOperation doctor;

    public Patient(int treatPlan) {
        this.treatPlan = treatPlan;
        doctor = Therapist.appointADoctor(treatPlan);
    }

    public int getTreatPlan() {
        return treatPlan;
    }

    public DoctorOperation getDoctor() {
        return doctor;
    }

    public void setTreatPlan(int treatPlan) {
        this.treatPlan = treatPlan;
        doctor = Therapist.appointADoctor(treatPlan);
    }
}
