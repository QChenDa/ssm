package com.dao;

import java.util.List;
import java.util.Map;
import com.entity.Emp;

public interface EmpMapper {
//	����Ա��
	public void add(Emp emp);
//	ͨ��ID��ѯԱ��
	public Emp FindByID(Integer id) ;
//  ����Ա��
	public boolean Update(Emp emp);
//	ͨ��idɾ��Ա��
	public boolean deleteByCondition(List<String> list);
//	ͨ��������ѯԱ��
	public List<Emp> FindByCondition(Map map);
}
