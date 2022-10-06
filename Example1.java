package Enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class Example1 {

    public static void main(String[] args) {

        Enumeration days;
        Vector dayNames = new Vector();

        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");

        days = dayNames.elements();
        while(days.hasMoreElements()){
            System.out.println(days.nextElement());
        }
    }
}
