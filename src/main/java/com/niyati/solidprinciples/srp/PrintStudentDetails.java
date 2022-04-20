package com.niyati.solidprinciples.srp;

public class PrintStudentDetails {
    Student student;

    public PrintStudentDetails(Student student) {
        this.student = student;
    }
    String printStudentDetails(){
        return ("StudentID:"+student.getId()+" StudentName:"+student.getName()
                +" ScienceMarks:"+student.getScienceMarks()
                +" MathsMarks:"+student.getMathsMarks()) ;
    }
}
