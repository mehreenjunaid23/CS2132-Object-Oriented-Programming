package lab6_1;

public class staff extends employee
{
//A staff member has a title
String title;

//Constructor with arguments
public staff(String name,String address,String phonenumber,String email,String off,int salary,String tit)
{
super(name,address,phonenumber,email,off,salary);
title=tit;

}
public String toString()
{
return (super.toString() + "\ntitle: "+title);
}
}
