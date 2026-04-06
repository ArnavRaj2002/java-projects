package com.nit.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nit.model.Employee;
@Repository
public class EmployeeDAO {
	
	@Autowired
	private DataSource ds;

	public String addEmployee(Employee employee) 
	{
		String sql="insert into employeeInfo values(?,?,?,?)";
		try(Connection con=ds.getConnection())
		{
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setLong(1, employee.getEmpId());
			pstmt.setString(2,employee.getEmpName());
			pstmt.setString(3, employee.getDept());
			pstmt.setDouble(4, employee.getSalary());
			int executeUpdate = pstmt.executeUpdate();
			if(executeUpdate>0)
			{
				return "Data Inserted Sucessfully having id !!: "+employee.getEmpId();
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "Data Not Inserted Sucessfully !!";
	}

	public List<Employee> getAllEmployees()
   {
		List<Employee> list=new ArrayList<Employee>();
	   try(Connection con=ds.getConnection())
	   {
		   PreparedStatement pstmt=con.prepareStatement("select * from employeeInfo");
		   ResultSet rs = pstmt.executeQuery();
		   while(rs.next())
		   {
			   list.add(new Employee( rs.getLong(1),rs.getString(2),rs.getString(3),rs.getDouble(4)));
		   }
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	   return list;
   }

	public String updateEmployeeSalary(long id, double newSalary)
   {
	   try(Connection con=ds.getConnection())
	   {
		   PreparedStatement pstmt=con.prepareStatement("update employeeInfo set SALARY=? where EMPID=?");
		   pstmt.setDouble(1, newSalary);
		   pstmt.setLong(2, id);
		   int executeUpdate = pstmt.executeUpdate();
		   if(executeUpdate>0) System.out.println("Data Updated Sucessfully !!");
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	   return "Data Not Updated Sucessfully !!";
   }

	public String deleteEmployee(long id)
	//public String deleteEmployee(Employee emp) //=>Memory+time waste
	
  {
		try(Connection con=ds.getConnection())
		   {
			   PreparedStatement pstmt=con.prepareStatement("delete from employeeInfo where EMPID=?");
			   pstmt.setLong(1, id);
			  // pstmt.setLong(1, emp.getEmpId());
			   
			   int executeUpdate = pstmt.executeUpdate();
			   if(executeUpdate>0)
				   return "Data Deleted Sucessfully !!";
			    
		   }
		   catch(Exception e)
		   {
			   e.printStackTrace();
		   }
		 return "Data Deletion Failed !!";
	   }
  }



	