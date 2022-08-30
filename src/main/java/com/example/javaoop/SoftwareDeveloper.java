package com.example.javaoop;

public class SoftwareDeveloper extends Employee implements ISoftwareDeveloper {
    private Manager supervisor;
    private String skilss;
    private int experience;
    public SoftwareDeveloper(int id, String firstName, String lastName, int age, int salary,
                             String department,Manager supervisor, String skilss, int experience) {
        super(id, firstName, lastName, age, salary, department);
        this.supervisor = supervisor;
        this.skilss = skilss;
        this.experience = experience;
    }

    @Override
    public void writeCode() {
        System.out.println("Code has been written by : " + getFirstName() + " " + getLastName());
    }

    @Override
    public void testCode() {
        System.out.println("Code has been tested by : " + getFirstName() + " " + getLastName());
    }

    @Override
    public void pushChanges() {
        System.out.println("Code has been pushed by : " + getFirstName() + " "+ getLastName());
    }

    @Override
    public String getSkills() {
        return skilss;
    }

    public Manager getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Manager supervisor) {
        this.supervisor = supervisor;
    }

    public String getSkilss() {
        return skilss;
    }

    public void setSkilss(String skilss) {
        this.skilss = skilss;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    // A Manager has Supervisor, skills, experience attribute additionally.
    // Please implement necessary methods to get and set these attributes of Manager
}
