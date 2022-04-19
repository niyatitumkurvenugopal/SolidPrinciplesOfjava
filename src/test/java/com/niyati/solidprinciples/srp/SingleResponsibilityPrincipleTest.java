package com.niyati.solidprinciples.srp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingleResponsibilityPrincipleTest {
    @Test
    void testSingleResponsibility() {
        Student student = new Student(1, "Niyati", 30, 40);

        PrintStudentDetails studentDetails = new PrintStudentDetails(student);
        assertEquals("StudentID:1 StudentName:Niyati ScienceMarks:30 MathsMarks:40", studentDetails.printStudentDetails());

        CalculateTotalMarks calculateTotalMarks = new CalculateTotalMarks(student);
        assertEquals(70, calculateTotalMarks.totalMarks());

    }


}