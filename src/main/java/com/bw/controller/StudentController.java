package com.bw.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bw.bean.Classes;
import com.bw.bean.Middle;
import com.bw.bean.Student;
import com.bw.mapper.StudentMapper;
import com.bw.service.StudentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class StudentController {
	@Autowired
	public StudentService service;
	@RequestMapping("slist")
	public String getlist(Model model,String name,String cname,@RequestParam(defaultValue = "1")int pageNum) {
		PageHelper.startPage(pageNum, 2);
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("name", name);
		map.put("cname", cname);
		List<Student> slist = service.slist(map);
		model.addAttribute("slist",slist);
		PageInfo<Student> pi = new PageInfo<Student>(slist);
		model.addAttribute("map", map);
		model.addAttribute("pi", pi);
		return "list";
		
	}
	
	@RequestMapping("toadd")
	public String toadd(Model model) {
		List<Classes> clist = service.clist();
		model.addAttribute("clist",clist);
		return "add";
		
	}
	
	@RequestMapping("addstu")
	public String add(Student stu,String[] ids) {
		int insertstu = service.insertstu(stu);
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("sid", stu.getSid());
		for (String string : ids) {
			map.put("cid", string);
			service.insertmiddle(map);
		}
		return "redirect:slist";
		
	}
	
	@RequestMapping("toupd")
	public String toupd(Model model,int sid) {
		Student shx = service.shx(sid);
		Middle mhx = service.mhx(sid);
		List<Classes> clist = service.clist();
		model.addAttribute("shx", shx);
		model.addAttribute("mhx", mhx);
		model.addAttribute("clist", clist);
		return "upd";
	}
	
	@RequestMapping("upd")
	public String upd(int sid,Student stu,String[] ids) {
		int delmiidle = service.delmiidle(sid);
		int updatestu = service.updatestu(stu);
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("sid",sid);
		for (String string : ids) {
			map.put("cid",string);
			service.insertmiddle(map);
		}
		return null;
		
	}
}
