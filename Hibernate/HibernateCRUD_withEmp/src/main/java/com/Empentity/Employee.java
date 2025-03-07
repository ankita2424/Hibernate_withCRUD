package com.Empentity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // for table creation
@Table(name="EmployeeRecord")//rename option for table
public class Employee {
		@Id//primary key
		@GeneratedValue(strategy=GenerationType.IDENTITY)//Auto_increment features
		private int emp_id;
		private String name;
		@Column(name="designation")
		private String role;
		private String city;
		private long salary;
		private String mail;
		private String password;
		private int dept_no;
		public Employee() {
			
		}
		public Employee( String name, String role, String city, long salary, String mail, String password,
				int dept_no) {
			
			this.name = name;
			this.role = role;
			this.city = city;
			this.salary = salary;
			this.mail = mail;
			this.password = password;
			this.dept_no = dept_no;
		}
	
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public long getSalary() {
			return salary;
		}
		public void setSalary(long salary) {
			this.salary = salary;
		}
		public String getMail() {
			return mail;
		}
		public void setMail(String mail) {
			this.mail = mail;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public int getDept_no() {
			return dept_no;
		}
		public void setDept_no(int dept_no) {
			this.dept_no = dept_no;
		}
		@Override
		public String toString() {
			return "Employee [emp_id=" + emp_id + ", name=" + name + ", role=" + role + ", city=" + city + ", salary="
					+ salary + ", mail=" + mail + ", password=" + password + ", dept_no=" + dept_no + "]";
		}
		
		
		
		



}

