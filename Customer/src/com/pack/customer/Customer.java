package com.pack.customer;

public class Customer {
    int ageEligibility;
    int workExperienceEligibility;
    String genderEligibility;
    String workLocationEligibility;
    int numberOfYearWorkExperienceEligibility;

    public int getAgeEligibility() { 
        return ageEligibility;
    }

    public void setAgeEligibility(int ageEligibility) {
        this.ageEligibility = ageEligibility;
    }

    public int getWorkExperienceEligibility() {
        return workExperienceEligibility;
    }

    public void setWorkExperienceEligibility(int workExperienceEligibility) {
        this.workExperienceEligibility = workExperienceEligibility;
    }

    public String getGenderEligibility() {
        return genderEligibility;
    }

    public void setGenderEligibility(String genderEligibility) {
        this.genderEligibility = genderEligibility;
    }

    public String getWorkLocationEligibility() {
        return workLocationEligibility;
    }

    public void setWorkLocationEligibility(String workLocationEligibility) {
        this.workLocationEligibility = workLocationEligibility;
    }

    public int getNumberOfYearWorkExperienceEligibility() {
        return numberOfYearWorkExperienceEligibility;
    }

    public void setNumberOfYearWorkExperienceEligibility(int numberOfYearWorkExperienceEligibility) {
        this.numberOfYearWorkExperienceEligibility = numberOfYearWorkExperienceEligibility;
    }

    public Customer(int ageEligibility, int workExperienceEligibility, String genderEligibility, String workLocationEligibility, int numberOfYearWorkExperienceEligibility) {
        this.ageEligibility = ageEligibility;
        this.workExperienceEligibility = workExperienceEligibility;
        this.genderEligibility = genderEligibility;
        this.workLocationEligibility = workLocationEligibility;
        this.numberOfYearWorkExperienceEligibility = numberOfYearWorkExperienceEligibility;
    }

}
