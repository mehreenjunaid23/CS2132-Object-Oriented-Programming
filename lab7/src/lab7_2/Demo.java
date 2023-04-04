package lab7_2;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Demo {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
System.out.println("enter the customer name");
String customerName = scanner.next();
Random random = new Random();
int id = random.nextInt(1000);
System.out.println("enter the balance in your account");
double balance = scanner.nextDouble();
System.out.println("enter the annualinterest rate");
double annualIntrestRate = scanner.nextDouble();

Account account = new Account(id, balance, customerName);
account.setAnnualIntrestRate(annualIntrestRate);

System.out.println("enter the money to deposit");
double depositedAmount = scanner.nextDouble();
double amount = account.deposite(depositedAmount);

System.out.println("enter the money withdraw");

double withdrawAmount = scanner.nextDouble();

double amount1 = account.withDraw(withdrawAmount);

System.out.println("the account information is");

System.out.println(account.toString());

System.out.println("the all transacions are");

for (Transaction transaction : account.getTransactionsList()) {
System.out.println(transaction.toString());
}

}

}


