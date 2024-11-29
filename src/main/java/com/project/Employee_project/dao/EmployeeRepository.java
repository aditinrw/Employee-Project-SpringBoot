package com.project.Employee_project.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.Employee_project.entity.Employee;

@Repository
public class EmployeeRepository {
	@Autowired
	SessionFactory sf;
	
	public List<Employee> getAllEmpoyee(){
			Session ss = null;
			Transaction tr = null;
		try {
			ss = sf.openSession();
			tr = ss.beginTransaction();
			String hqlQuery = "From Employee";
			Query<Employee> query = ss.createQuery(hqlQuery, Employee.class);
			List<Employee> employee = query.list();
			tr.commit(); 
			return employee;
		}catch(HibernateException e) {
			if(tr != null) {
				tr.rollback();
			}
			e.printStackTrace();
		}finally {
			if(ss != null) {
				ss.close();
			}
		}
		return null;
	}
	
	public List<Employee> getEmployeeByStatus(String status){
		Session ss = null;
		Transaction tr = null;
		try {
			ss = sf.openSession();
			tr = ss.beginTransaction();
			String hqlQuery = "From Employee where status = :e_status";
			Query<Employee> query = ss.createQuery(hqlQuery, Employee.class);
			query.setParameter("e_status", status);
			List<Employee> employee = query.list();
			tr.commit();
			ss.close(); 
			return employee;
		}catch(HibernateException e) {
			if(tr != null) {
				tr.rollback();
			}
			e.printStackTrace();
		}finally {
			if(ss != null) {
				ss.close();
			}
		}
		return null;
	}
	
	public List<Employee> getEmployeeById(int id){
		Session ss = null;
		Transaction tr = null;
		try {
			ss = sf.openSession();
			tr = ss.beginTransaction();
			String hqlQuery = "From Employee where id = :e_id";
			Query<Employee> query = ss.createQuery(hqlQuery, Employee.class);
			query.setParameter("e_id", id);
			List<Employee> employee = query.list();
			tr.commit();
			ss.close(); 
			return employee;
		}catch(HibernateException e) {
			
		}finally {
			if(ss != null) {
				ss.close();
			}
		}
		return null;
	}
	
	public List<Employee> getEmployeeByName(String name) {
		Session ss = null;
		Transaction tr = null;
		try {
			ss = sf.openSession();
			tr = ss.beginTransaction();
			String hqlQuery = "From Employee where name = :e_name";
			Query<Employee> query = ss.createQuery(hqlQuery, Employee.class);
			query.setParameter("e_name", name);
			List<Employee> employee = query.list();
			tr.commit();
			ss.close(); 
			return employee;
		}catch(HibernateException e) {
			if(tr != null) {
				tr.rollback();
			}
			e.printStackTrace();
		}finally {
			if(ss != null) {
				ss.close();
			}
		}
		return null;
	}
	
	public String addEmployee(Employee emp) {
		Session ss = null;
		Transaction tr = null;
		try {
			ss = sf.openSession();
			tr = ss.beginTransaction();
			ss.persist(emp);
			tr.commit();
			ss.close();
		}catch(HibernateException e) {
			if(tr != null) {
				tr.rollback();
			}
			e.printStackTrace();
		}finally {
			if(ss != null) {
				ss.close();
			}
		}
		return "Employee added Sucessfully!!";
	}
	
	public String updateEmployeeCountry(String country,int cid) {
		Session ss = null;
		Transaction tr = null;
		try {
			ss = sf.openSession();
			tr = ss.beginTransaction();
			String hqlQuery = "Update Employee set country = :c_name where cid = :e_cid";
			Query query = ss.createQuery(hqlQuery);
			query.setParameter("c_name", country);
			query.setParameter("e_cid", cid);
			query.executeUpdate();
			tr.commit();
			ss.close(); 
		}catch(HibernateException e) {
			if(tr != null) {
				tr.rollback();
			}
			e.printStackTrace();
		}finally {
			if(ss != null) {
				ss.close();
			}
		}
		return "Employee Country Name Updated!!";
	}
	
	public String delteEmployeeByCountry(String country) {
		Session ss = null;
		Transaction tr = null;
		try {
			ss = sf.openSession();
			tr = ss.beginTransaction();
			String hqlQuery = "DELETE FROM Employee WHERE country = :e_country";
			Query query = ss.createQuery(hqlQuery);
			query.setParameter("e_country", country);
			query.executeUpdate();
			tr.commit();
			ss.close(); 
		}catch(HibernateException e) {
			if(tr != null) {
				tr.rollback();
			}
			e.printStackTrace();
		}finally {
			if(ss != null) {
				ss.close();
			}
		}
		return "Employee Country Name Updated!!";
	}
	
	public String delteEmployeeById(int id) {
		Session ss = null;
		Transaction tr = null;
		try {
			ss = sf.openSession();
			tr = ss.beginTransaction();
			Employee emp = ss.get(Employee.class, id);
			ss.remove(emp);
			tr.commit();
			ss.close(); 
		}catch(HibernateException e) {
			if(tr != null) {
				tr.rollback();
			}
			e.printStackTrace();
		}finally {
			if(ss != null) {
				ss.close();
			}
		}
		return "Employee record deleted!!";
	}

}
