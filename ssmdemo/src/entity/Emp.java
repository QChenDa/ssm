package entity;

import oracle.sql.DATE;
//ʹ�õ���oracle����ϰ��
public class Emp {
	//Ա�����
	private String EMPNO;
//	ְλ����
	private String JOB;
//	��Ӷ����
	private DATE HIREDATE;
//	нˮ
	private Integer SAL;
//	
	private Integer COMM;
//	���ű��
	private Integer DEPTNO;
//	
	private Integer MGR;
	public String getEMPNO() {
		return EMPNO;
	}
	public void setEMPNO(String eMPNO) {
		EMPNO = eMPNO;
	}
	public String getJOB() {
		return JOB;
	}
	public void setJOB(String jOB) {
		JOB = jOB;
	}
	public DATE getHIREDATE() {
		return HIREDATE;
	}
	public void setHIREDATE(DATE hIREDATE) {
		HIREDATE = hIREDATE;
	}
	public Integer getSAL() {
		return SAL;
	}
	public void setSAL(Integer sAL) {
		SAL = sAL;
	}
	public Integer getCOMM() {
		return COMM;
	}
	public void setCOMM(Integer cOMM) {
		COMM = cOMM;
	}
	public Integer getDEPTNO() {
		return DEPTNO;
	}
	public void setDEPTNO(Integer dEPTNO) {
		DEPTNO = dEPTNO;
	}
	public Integer getMGR() {
		return MGR;
	}
	public void setMGR(Integer mGR) {
		MGR = mGR;
	}
	public Emp(String eMPNO, String jOB, DATE hIREDATE, Integer sAL, Integer cOMM, Integer dEPTNO,
			Integer mGR) {

		EMPNO = eMPNO;
		JOB = jOB;
		HIREDATE = hIREDATE;
		SAL = sAL;
		COMM = cOMM;
		DEPTNO = dEPTNO;
		MGR = mGR;
	}
	public Emp() {
	}
	

}
