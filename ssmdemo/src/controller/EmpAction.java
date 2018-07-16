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
//	增加员工
	@RequestMapping("/add")
	public String add(Emp emp,Model model){
		empService.add(emp);
		model.addAttribute("message","66666");
		return "succes.jsp";
	}
//	通过ID查询员工
	@RequestMapping("/FindByID")
	public String FindByID(Integer id,Model model){
		model.addAttribute(empService.FindByID(id));
		return "f.jsp";
	}
//  更新员工
	@RequestMapping("/Update")
	public String Update(Emp emp){
		if(empService.Update(emp))
			return "success.jsp";
		return "error.jsp";
	}
//	通过id删除员工
	@RequestMapping("/Delete")
	public String Delete(int... ids){
		if(empService.Delete(ids))
			return "success.jsp";
		return "error.jsp";
	}
//	通过条件查询员工
	@RequestMapping("/FindByCondition")
	public String FindByCondition(Map map,Model model){
		model.addAttribute(empService.FindByCondition(map));
		return "ff.jsp";
	}
}
