package lab6_2;

public class test {
	public static void main(String[] args){
	savings_acc sa=new savings_acc(2323, 98487 , "July 2020", 10.4);
	checking_acc ca=new checking_acc(3245, 45000, "March 2018" , 5000);
	System.out.println("Savings Account Info :");
	System.out.println(sa);
	
	//deposit money
	sa.deposit(9000);

	System.out.println("\n\tAfter deposit:\n\tNew balance:"+sa.getBalance());
	//withdraw money
	sa.withdraw(4000);
	System.out.println("\n\tAfter withdrawl:\n\tNew balance::"+sa.getBalance());
	
	//add interest 
	sa.addInterest();
	System.out.println("\n\tAfter adding Interest:\n\tNew balance : "+sa.getBalance());
	System.out.println("\tMonthly Interest :$"+sa.getMonthlyInterest());
	
	System.out.println("\nChecking Account Info :");
	System.out.println(ca);

	ca.deposit(5000);
	System.out.println("\tAfter deposit, New balance :$"+ca.getBalance());
	ca.withdraw(2000);
	System.out.println("\tAfter withdrawl, New balance :$"+ca.getBalance());}}
