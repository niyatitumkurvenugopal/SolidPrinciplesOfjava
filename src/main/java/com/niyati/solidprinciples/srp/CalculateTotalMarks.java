package com.niyati.solidprinciples.srp;

public class CalculateTotalMarks {
    Student student;

    public CalculateTotalMarks(Student student) {
        this.student = student;
    }
    int totalMarks(){
        return  student.getScienceMarks()+ student.getMathsMarks();
    }
}
