package com.Taks8.BuilderDesignPatternDemo.model;

public class Employee {

    private int id;
    private String employeeName;
    private String designation;
    private String location;
    //add email


    public Employee(Builder builder) {

        this.id = builder.id;
        this.employeeName = builder.employeeName;
        this.designation = builder.designation;
        this.location = builder.location;
    }

    public int getId() {
        return id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDesignation() {
        return designation;
    }

    public String getLocation() {
        return location;
    }

    public static final class Builder {
        private int id;
        private String employeeName;
        private String designation;
        private String location;

        private Builder(int id, String employeeName, String designation, String location) {
            this.id = id;
            this.employeeName = employeeName;
            this.designation = designation;
            this.location = location;
        }

        private Builder(int id, String employeeName, String designation) {
            this.id = id;
            this.employeeName = employeeName;
            this.designation = designation;
        }


        public Builder withId(int id) {
            this.id = id;
            return this;
        }

        public Builder withEmployeeName(String employeeName) {
            this.employeeName = employeeName;
            return this;
        }

        public Builder withDesignation(String designation) {
            this.designation = designation;
            return this;
        }

        public Builder withLocation(String location) {
            this.location = location;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
