package com.example.covid19helper;

public class helperdataset {
    private String problem,address,phone;

    public helperdataset(String problem, String address, String phone) {
        this.problem = problem;
        this.address = address;
        this.phone = phone;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
