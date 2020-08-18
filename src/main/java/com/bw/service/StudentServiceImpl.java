package com.bw.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.bean.Classes;
import com.bw.bean.Middle;
import com.bw.bean.Student;
import com.bw.mapper.StudentMapper;
@Service
public class StudentServiceImpl implements StudentService {

	
	@Autowired
	public StudentMapper mapper;
	public List<Student> slist(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return mapper.slist(map);
	}
	public List<Classes> clist() {
		// TODO Auto-generated method stub
		return mapper.clist();
	}
	public int insertstu(Student stu) {
		// TODO Auto-generated method stub
		return mapper.insertstu(stu);
	}
	public int insertmiddle(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return mapper.insertmiddle(map);
	}
	public Student shx(int sid) {
		// TODO Auto-generated method stub
		return mapper.shx(sid);
	}
	public int delmiidle(int sid) {
		// TODO Auto-generated method stub
		return mapper.delmiidle(sid);
	}
	public int updatestu(Student stu) {
		// TODO Auto-generated method stub
		return mapper.updatestu(stu);
	}
	public Middle mhx(int sid) {
		// TODO Auto-generated method stub
		return mapper.mhx(sid);
	}

}
