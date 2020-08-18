package com.bw.mapper;

import java.util.List;
import java.util.Map;

import com.bw.bean.Classes;
import com.bw.bean.Middle;
import com.bw.bean.Student;

public interface StudentMapper {
	public List<Student> slist(Map<String, Object> map);
	public List<Classes> clist();
	public int insertstu(Student stu);
	public int insertmiddle(Map<String, Object> map);
	public Student shx(int sid);
	public int delmiidle(int sid);
	public int updatestu(Student stu);
	public Middle mhx(int sid);
}
