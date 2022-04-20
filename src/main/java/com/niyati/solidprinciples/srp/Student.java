package com.niyati.solidprinciples.srp;

public class Student {
    int id;
    String name;
    int scienceMarks;
    int mathsMarks;

    public Student(int id, String name, int scienceMarks, int mathsMarks) {
        this.id = id;
        this.name = name;
        this.scienceMarks = scienceMarks;
        this.mathsMarks = mathsMarks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScienceMarks() {
        return scienceMarks;
    }

    public void setScienceMarks(int scienceMarks) {
        this.scienceMarks = scienceMarks;
    }

    public int getMathsMarks() {
        return mathsMarks;
    }

    public void setMathsMarks(int mathsMarks) {
        this.mathsMarks = mathsMarks;
    }

}
