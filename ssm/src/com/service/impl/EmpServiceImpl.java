package com.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.*;
import com.entity.Emp;
import com.service.EmpService;
@Service
public class EmpServiceImpl implements EmpService{
	@Autowired
	private EmpMapper empDao;
	
	@Override
	public void add(Emp emp) {
		// TODO Auto-generated method stub
		empDao.add(emp);
	}

	@Override
	public Emp FindByID(Integer id) {
		// TODO Auto-generated method stub
		return empDao.FindByID(id);
	}

	@Override
	public boolean Update(Emp emp) {
		// TODO Auto-generated method stub
		return empDao.Update(emp);
	}

	@Override
	public boolean Delete(List<String>  list) {
		// TODO Auto-generated method stub
		return empDao.deleteByCondition(list);
	}

	@Override
	public List<Emp> FindByCondition(Map map) {
		// TODO Auto-generated method stub
		return empDao.FindByCondition(map);
	}

}
