package org;

public class Employees_details {

	public static void main(String[] args) {
	Employees Lucky=new Employees();
	//Using setter
	Lucky.setName("Lucky Chaudhary");
	Lucky.setId("1111");
	Lucky.setEmail("himanshuchaudhary7009@gmail.com");
	Lucky.setAddress("basantpur-Faridabad");
	Lucky.setPhone_no("8171972173");
	Lucky.setDepartment("java developer");
	Lucky.setDob("19 july 2004");
	Lucky.setNationality("indian");
	Lucky.setSalary("15000");
	System.out.println("Employee Lucky Details:"+Lucky.toString());
	System.out.println();
	//Using getter
	System.out.println("Name of the employee is : "+Lucky.getName());
	System.out.println("Phone no. of the employee is : "+Lucky.getPhone_no());
	System.out.println("Address of the employee is : "+Lucky.getAddress());
	System.out.println("E-mail address of the employee is : "+Lucky.getEmail());
	System.out.println("Dob of the employee is : "+Lucky.Dob);
	System.out.println("Department of the employee is : "+Lucky.Department);
	}

}
