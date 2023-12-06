package com.codebun.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codebun.dao.StudentDAO;
import com.codebun.model.Student;
@Service
public class StudentServiceImpl implements StudentService {

 @Autowired
 private StudentDAO studentDao;
 @Transactional
 public void registerStudent(Student student) {
  // TODO Auto-generated method stub
  studentDao.registerStudent(student);
 }

 public Student loginStudent(Student student) {
  // TODO Auto-generated method stub
  return studentDao.loginStudent(student);
 }

}