package org;

public class Customer {
String Name;
String Customer_id;
String Age;
String Phone_no;
String Address;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getCustomer_id() {
	return Customer_id;
}
public void setCustomer_id(String customer_id) {
	Customer_id = customer_id;
}
public String getAge() {
	return Age;
}
public void setAge(String age) {
	Age = age;
}
public String getPhone_no() {
	return Phone_no;
}
public void setPhone_no(String phone_no) {
	Phone_no = phone_no;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
@Override
public String toString() {
	return "[Name=" + Name + ", Customer_id=" + Customer_id + ", Age=" + Age + ", Phone_no=" + Phone_no
			+ ", Address=" + Address + "]";
}

}
