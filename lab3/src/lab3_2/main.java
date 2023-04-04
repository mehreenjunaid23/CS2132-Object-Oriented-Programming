package lab3_2;

public class main {

    public static void main(String[] args) {
        
        stock s1 = new stock("ORCL","Oracle");
        s1.setPreviousClosingPrice(34.5);
        s1.setCurrentPrice(34.35);

        System.out.printf("The percentage change of s1 is:\n"+ s1.getChangePercent());
        
    }
}
