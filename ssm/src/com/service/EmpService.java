package com.service;

import java.util.List;
import java.util.Map;

import com.entity.Emp;

public interface EmpService {
//	����Ա��
	public void add(Emp emp);
//	ͨ��ID��ѯԱ��
	public Emp FindByID(Integer id);
//  ����Ա��
	public boolean Update(Emp emp);
//	ͨ��idɾ��Ա��
	public boolean Delete(List<String> list);
//	ͨ��������ѯԱ��
	public List<Emp> FindByCondition(Map map);
}
