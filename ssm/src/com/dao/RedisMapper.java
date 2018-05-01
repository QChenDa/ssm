package com.dao;

import java.util.List;

import com.entity.Dept;

public interface RedisMapper {
	public List<Dept> FindAll();
}
