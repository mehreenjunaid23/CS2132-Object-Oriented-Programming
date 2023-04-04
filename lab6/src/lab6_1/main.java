package lab6_1;

public class main {
	public static void main(String[] args)
	{
	// create objects for classes
	person p=new person("Mehreen","Jeddah","232323","m@gmail.com");
	person s=new student("aisha","USA","12345","a@yahoo.com",2);
	person e=new employee("John","Canada","19290123","venki@awg.in","Info",50000);
	person f=new faculty("Akila","KSA","99999","akila@qa.com","effat",60000,"9-7pm","Dean");
	person st=new staff("Martin","Nuzvid","120123","Kk@yahoo.in","IBM",30000,"SME");
	
	// display output
	System.out.println(p.toString()+"\n");
	System.out.println(s.toString()+"\n");
	System.out.println(e.toString()+"\n");
	System.out.println(f.toString()+"\n");
	System.out.println(st.toString()+"\n");
	}

}
