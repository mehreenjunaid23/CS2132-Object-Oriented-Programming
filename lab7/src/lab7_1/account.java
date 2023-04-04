package lab7_1;

public class account {
	double amount;
    double rate;
    int time;
    account(){
    	
    }
    public account(double amount, double rate, int time) {
        this.amount = amount;
        this.rate = rate;
        this.time = time;
    }
    

    @Override
    public String toString() {
        return "Loan{" +
                "amount=" + amount +
                ", rate=" + rate +
                ", time=" + time +
                '}';
    }
}

