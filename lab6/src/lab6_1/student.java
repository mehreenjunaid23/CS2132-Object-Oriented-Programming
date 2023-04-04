package lab6_1;

public class student extends person
{
//A student has a class status
//(freshman,sophomore, junior, or senior).
//Define the status as a constant.
final int freshman =1;
final int sophomore =2;
final int junior=3;
final int senior=4;
String status="freshman";
//Constructor with arguments
public student(String name, String address,String phonenumber, String email, int Status)
{
	super(name,address,phonenumber,email);
	if(Status == 1){
	status = "freshman";}
	if(Status == 2){
	status = "sophomore";}
	if(Status == 3){
	status = "junior";}
	if(Status == 4){
	status = "Senior";}
	status += " student";
}

public String toString(){
return super.toString() + "\nstatus: "+status;}
}

