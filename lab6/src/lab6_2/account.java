package lab6_2;

public class account {
	int account_number;
	double balance;
	double annual_interest_rate;
	String date_created;
	
	public account(int accNo,double bal, String d) {
		balance = bal;
		account_number = accNo;
		date_created=d;}


	public void deposit(double x) {
		if (x>0)
			balance += x;
		else
			System.out.println("Sorry, Account deposit cannot be a negative amount...");}
	
	public void withdraw(double x) {
		if(x>0) {
			if (balance >=x)
				balance -= x;
			else
				System.out.println("Not enough balance to withraw your desired amount.\nYour current account balance is: "+ balance);}
		else
			System.out.println("Sorry, Account withdrawal cannot be a negative ammount...");}
	
	public double getBalance() {
		return balance;}

	public int getAccountNumber() {
		return account_number;}

	public String toString() {
		return "\nAccount " + account_number + ": " + "\n\tBalance: " + balance+ "\n\tDate created: "+date_created;}

	public final void print() {
		System.out.println(toString());}}

