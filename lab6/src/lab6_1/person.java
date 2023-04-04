package lab6_1;

public class person {
	//A person has a name, address, phone number, and email address.
	String name;
	String address;
	String phone;
	String email;

	//Constructor with arguments
	person(String n,String a,String num,String e){
	name=n;
	address=a;
	phone=num;
	email=e;
	}
	// toString() method to return the name
	public String toString()
	{
	return "class: "+getClass().getName()+"\nname: "+name;
	}}
