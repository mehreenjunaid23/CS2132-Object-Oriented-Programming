package lab7_1;
import java.util.*;
public class main {
	public static void main(String[] args) {
        ArrayList<Object> obj = new ArrayList<Object>();
        obj.add(new account(35000,10.5,5));
        obj.add(new Date());
        obj.add("Test");
        obj.add(new circle(5,5,10));
        for(Object x : obj){
            System.out.println(x.toString());
        }
    }
}

