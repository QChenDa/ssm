package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.Emp;
import com.entity.FormIds;
import com.entity.FormMap;
import com.service.EmpService;

@Controller
@RequestMapping("/emp")
public class EmpAction {
	@Resource
	private EmpService empService;
//	����Ա��
	@RequestMapping(value = "/add")
	public String add(Emp emp,Model model){
		empService.add(emp);
		System.out.println(emp.getENAME());
		model.addAttribute("message","66666");
		return "/succes.jsp";
	}
//	ͨ��ID��ѯԱ��
	@RequestMapping(value = "/FindByID")
	public String FindByID(Integer id,Model model){
		model.addAttribute("message",empService.FindByID(id));
		return "/succes.jsp";
	}
//  ����Ա��
	@RequestMapping(value = "/Update")
	public String Update(Emp emp){
		if(empService.Update(emp))
			return "/succes.jsp";
		return "/error.jsp";
	}
//	ͨ��idɾ��Ա��
	@RequestMapping(value = "/Delete")
	public String Delete(FormIds formIds){
		if(empService.Delete(formIds.getList()))
			return "/succes.jsp";
		return "/error.jsp";
	}
//	ͨ��������ѯԱ��
	@RequestMapping(value = "/FindByCondition")
	public String FindByCondition(FormMap map,Model model){
		 map.getMap().put("DEPTNO",null);
		System.out.println("---------------------------------------------"+map.getMap().get("EMPNO")+"--------------");
		List<Emp> list = empService.FindByCondition(map.getMap());
		model.addAttribute("message",list.get(0).getENAME());
		return "/succes.jsp";
	}
}
