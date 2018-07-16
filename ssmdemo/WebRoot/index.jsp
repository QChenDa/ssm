<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
   <p>实体传参</p>
	
  </head>
  
  <body>
  <form action = "add.action" method="post">
  <table>
   <tr>
   <td>员工编号：</td>
   <td><input type="text" name = "emp.EMPNO"/></td>
   </tr>
   <tr>
   <td>名称：</td>	  
   <td><input type="text" name = "emp.ENAME"/></td>
   </tr>
   <tr>
   <td>工作名称:</td>
   <td><input type="text" name = "emp.JOB"/></td>
   </tr>
   <tr>      <td></td>
   <td><input type="text" name = "emp.MGR"/></td>
   </tr>
   <tr>
   <td>薪水:</td>  
   <td>  <input type="text" name = "emp.SAL"/></td>
   </tr>
         <tr> <td></td>
         <td><input type="text" name = "emp.COMM"/></td>
         </tr>
   <tr>
   <td>部门编号</td> 
   <td> <input type="text" name = "emp.DEPTNO"/></td>
   </tr>
   <tr>       <input type="submit" colspan="2" value = "提交"/>
   </tr>
   </table>
   </form>
  </body>
</html>
