package lab6_2;

public class savings_acc extends account {
	private double ann_int_rate;

	public savings_acc(int accNo, double bal, String d, double rate) {
		super(accNo, bal, d);
		setAnn_int_rate(rate);}

	public double getAnn_int_rate() {
		return ann_int_rate;}

	public void setAnn_int_rate(double rate) {
		ann_int_rate = rate;}
	
	@Override
	public void deposit(double amt) {
	super.deposit(amt);}
	
	@Override
	public void withdraw(double amt) {
	if (getBalance() > amt)
	super.withdraw(amt);}
	
	public double monthlyInterestRate() {
		return ann_int_rate/12;}

	public double getMonthlyInterest() {
	return getBalance() * (monthlyInterestRate() / 100);}

	public void addInterest() {
	super.deposit(getMonthlyInterest());}
	
	@Override
	public String toString() {
	return super.toString() + "\n\tAnnual Interest: " + ann_int_rate;
	}}

