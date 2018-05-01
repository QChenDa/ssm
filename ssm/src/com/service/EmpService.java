package com.service;

import java.util.List;
import java.util.Map;

import com.entity.Emp;

public interface EmpService {
//	增加员工
	public void add(Emp emp);
//	通过ID查询员工
	public Emp FindByID(Integer id);
//  更新员工
	public boolean Update(Emp emp);
//	通过id删除员工
	public boolean Delete(List<String> list);
//	通过条件查询员工
	public List<Emp> FindByCondition(Map map);
}
