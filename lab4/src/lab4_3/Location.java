package lab4_3;

	public class Location {
	   //Declaring variables
	   static int row;
	   static int column;
	   static double max;
	  
	   //constructor with parameter
	   public Location(int r, int c, double m) {
	       super();
	       row=1;
	       column=c;
	       max=m;}
	  
	   //Getters and setters
	   public int getRow() {
	       return row;}
	   public void setRow(int r) {
	       row = r;}
	   public int getColumn() {
	       return column; }
	   public void setColumn(int c) {
		   column = c; }
	   public double getMaxValue() {
	       return max;}
	   public void setMax(double m) {
	       max = m;}

	   //finding and locating the maximum value
	   public static Location locateLargest(double a[][]){   
	   max=a[0][0];
		   for(int i=0;i<a.length;i++)
		   {
		       for(int j=0;j<a[0].length;j++)
		       {	if(max<a[i][j]){
		               max=a[i][j];
		               row=i;
		               column=j;}}}
	     
	   Location l=new Location(row, column, max);
	   return l;  }}



	