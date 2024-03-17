package com.telusko.service;

import com.telusko.Student;

import java.util.List;

public interface IStudentService
{
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public Student getStudentById(Integer id);
    public void deleteStudentById(Integer id);
}
