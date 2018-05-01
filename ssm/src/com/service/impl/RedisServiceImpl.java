package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.dao.RedisMapper;
import com.entity.Dept;
import com.service.RedisService;
@Service
public class RedisServiceImpl implements RedisService {
	@Resource
	private RedisMapper RedisDao;
	@Resource
	private RedisTemplate redisTemplate;
	@SuppressWarnings("unchecked")
	@Override
	public List<Dept> FindAll() {
		// TODO Auto-generated method stub
		if(redisTemplate.opsForList().size("dept") != 0)
		{
			List<Dept> deptlist = RedisDao.FindAll();
			for (Dept dept : deptlist) {				
				redisTemplate.opsForList().rightPush("dept",dept);
			}
			return deptlist;		
		}
		else
		{
			System.out.println("-----------------------启用了缓存---------------");
//			0,-1代表了取整个集合
			return (List<Dept>) redisTemplate.opsForList().range("dept", 0, -1);
		}
	}

}
