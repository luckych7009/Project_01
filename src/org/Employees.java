package org;

public class Employees {
	String name;
	String id;
	String Email;
	String Address;
	String Phone_no;
	String Dob;
	String Department;
	String Salary;
	String nationality;
	
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getSalary() {
		return Salary;
	}
	public void setSalary(String salary) {
		Salary = salary;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPhone_no() {
		return Phone_no;
	}
	public void setPhone_no(String phone_no) {
		Phone_no = phone_no;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", id=" + id + ", Email=" + Email + ", Address=" + Address + ", Phone_no="
				+ Phone_no + ", Dob=" + Dob + ", Department=" + Department + ", Salary=" + Salary + ", nationality="
				+ nationality + "]";
	}
	
}
