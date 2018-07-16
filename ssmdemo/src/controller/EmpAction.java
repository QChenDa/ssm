package controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Emp;
import service.EmpService;

@Controller
@RequestMapping("/emp")
public class EmpAction {
	@Resource
	private EmpService empService;
//	����Ա��
	@RequestMapping("/add")
	public String add(Emp emp,Model model){
		empService.add(emp);
		model.addAttribute("message","66666");
		return "succes.jsp";
	}
//	ͨ��ID��ѯԱ��
	@RequestMapping("/FindByID")
	public String FindByID(Integer id,Model model){
		model.addAttribute(empService.FindByID(id));
		return "f.jsp";
	}
//  ����Ա��
	@RequestMapping("/Update")
	public String Update(Emp emp){
		if(empService.Update(emp))
			return "success.jsp";
		return "error.jsp";
	}
//	ͨ��idɾ��Ա��
	@RequestMapping("/Delete")
	public String Delete(int... ids){
		if(empService.Delete(ids))
			return "success.jsp";
		return "error.jsp";
	}
//	ͨ��������ѯԱ��
	@RequestMapping("/FindByCondition")
	public String FindByCondition(Map map,Model model){
		model.addAttribute(empService.FindByCondition(map));
		return "ff.jsp";
	}
}
