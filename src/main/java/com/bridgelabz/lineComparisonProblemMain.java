package com.bridgelabz;
import java.util.Scanner;
import java.lang.*;
public class lineComparisonProblemMain {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of first Line X1,X2,Y1,Y1 :");
        Line firstLine = new Line(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("Enter the value of second line X1,X2,Y1,Y2 :");
        Line secondLine = new Line(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        sc.close();
        LengthComparator lenthComparator = new LengthComparatorImpl();
        lenthComparator.compareUsingEqual(firstLine, secondLine);
        lenthComparator.compareUsingCompareTo(firstLine, secondLine);



    }
}
