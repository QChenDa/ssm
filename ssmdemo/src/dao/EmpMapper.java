package dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import entity.Emp;
public interface EmpMapper {
//	����Ա��
	public void add(Emp emp);
//	ͨ��ID��ѯԱ��
	public Emp FindByID(Integer id) ;
//  ����Ա��
	public boolean Update(Emp emp);
//	ͨ��idɾ��Ա��
	public boolean Delete(int... ids);
//	ͨ��������ѯԱ��
	public List<Emp> FindByCondition(Map map);
}
