package lab2_3;

public class population {
		public static void main(String[] args) {
		int currentPopulation=312032486;
		int numSecInyear=24*60*60*365;//for one day 24 hours,60 min,60 sec System.out.println("current population:"+currentPopulation);
		int numBirths=numSecInyear/7;
		int numDeaths=numSecInyear/13;
		int numImmigrant=numSecInyear/45;
		//print the result using for loop
		for(int i=1;i<=5;i++){
		currentPopulation=currentPopulation+numBirths- numDeaths+numImmigrant;//add up births and immigrants, remove deaths
		System.out.println("Population After year- "+i+":"+currentPopulation);
		} }
		    }
