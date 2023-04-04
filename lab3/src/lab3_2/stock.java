package lab3_2;

public class stock {

    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public stock(String s, String n) {
        symbol=s;
        name = n;
        previousClosingPrice = 0;
        currentPrice = 0;
    }

    public void setPreviousClosingPrice(double price) {
        previousClosingPrice = price;
    }

    public void setCurrentPrice(double price) {
        this.currentPrice = price;
    }

    public double getChangePercent() {
        return (currentPrice - previousClosingPrice)*100 / previousClosingPrice;
    }


}