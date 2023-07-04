package com.github.springsecurity.student;

/**
 * Created by M.Hadiyan
 * Date: 7/3/2023
 * Time: 10:02 AM
 **/
public class Student {

    private final Integer studentId;
    private final String studentName;

    public Student(Integer studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }
}
