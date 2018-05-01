package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.Dept;
import com.service.RedisService;

@Controller
@RequestMapping("/redis")
public class RedisAction {
	@Resource
	private RedisService redisService;
	@RequestMapping(value = "/FindAll")
	public String FindAll(Model model){
		List<Dept> list = redisService.FindAll();
		StringBuffer Name = new StringBuffer();
		for(Dept dept:list)
			Name.append(new StringBuffer(dept.getDNAME()));
		model.addAttribute("name",Name);
		return "/succes.jsp";
	}
}
