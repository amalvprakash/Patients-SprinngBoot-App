package com.NEST.PatientappBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patients")
public class ProductModel {
    @Id
    @GeneratedValue
    private int id;

    private int patientId;

    private String patientName;

    private String address;

    private String admitDate;

    private String doctorName;

    private String mobile;

    public ProductModel() {
    }

    public ProductModel(int id, int patientId, String patientName, String address,
                        String admitDate, String doctorName, String mobile) {
        this.id = id;
        this.patientId = patientId;
        this.patientName = patientName;
        this.address = address;
        this.admitDate = admitDate;
        this.doctorName = doctorName;
        this.mobile = mobile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAdmitDate() {
        return admitDate;
    }

    public void setAdmitDate(String admitDate) {
        this.admitDate = admitDate;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
