package org;

public class Customer_details {

	public static void main(String[] args) {
		Customer Lucky=new Customer();
		Lucky.setName("Lucky chaudhary");
		Lucky.setAge("20");
		Lucky.setCustomer_id("001");
		Lucky.setPhone_no("8171972173");
		Lucky.setAddress("Basantpur,Faridabad");
		System.out.println("Lucky Details : "+Lucky.toString());
		Customer aashu=new Customer();
		aashu.setName("Aashu Prajapati");
		aashu.setAge("21");
		aashu.setCustomer_id("002");
		aashu.setPhone_no("9888654321");
		aashu.setAddress("sec-29,Faridabad");
		System.out.println("Aashu Details : "+aashu.toString());
		System.out.println("Age of aashu :"+aashu.getAge());
		System.out.println("Name is : "+aashu.getName());
		System.out.println("Customer_id of aashu : "+aashu.getCustomer_id());
		System.out.println("Address of aashu : "+aashu.getAddress());
		System.out.println("Phone_no of aashu : "+aashu.getPhone_no());
	}

}
