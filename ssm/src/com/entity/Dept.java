package com.entity;

import java.io.Serializable;

public class Dept implements Serializable{
	private Integer DEPTNO;
	private String DNAME;
	public Integer getDEPTNO() {
		return DEPTNO;
	}
	public void setDEPTNO(Integer dEPTNO) {
		DEPTNO = dEPTNO;
	}
	public String getDNAME() {
		return DNAME;
	}
	public void setDNAME(String dNAME) {
		DNAME = dNAME;
	}
	public Dept(Integer dEPTNO, String dNAME) {
		super();
		DEPTNO = dEPTNO;
		DNAME = dNAME;
	}
	public Dept() {
		super();
	}
	
}
