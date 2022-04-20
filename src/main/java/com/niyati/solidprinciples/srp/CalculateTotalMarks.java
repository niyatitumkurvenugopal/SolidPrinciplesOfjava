package com.niyati.solidprinciples.srp;

public class CalculateTotalMarks {
    Student student;

    public CalculateTotalMarks(Student student) {
        this.student = student;
    }
    int totalMarks(){
        int total=student.getScienceMarks()+ student.getMathsMarks();
        return  total;
    }
}
