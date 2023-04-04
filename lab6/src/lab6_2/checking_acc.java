package lab6_2;

public class checking_acc extends account {
	private double creditLimt;
	
	public checking_acc(int accNo, double bal, String d,double cred_Lim) {
	super(accNo, bal, d);
	creditLimt=cred_Lim;}

	@Override
	public void deposit(double amt) {
	super.deposit(amt);}

	@Override
	public void withdraw(double amt) {
	if (getBalance() >= amt)
	super.withdraw(amt);}

	@Override
	public String toString() {
	return super.toString() + "\n\tCredit Limt: " + creditLimt;}
}
