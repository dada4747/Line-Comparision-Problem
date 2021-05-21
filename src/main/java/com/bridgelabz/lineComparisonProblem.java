package com.bridgelabz;

import java.util.Scanner;
import java.lang.*;
public class lineComparisonProblem {
    private final int x1;
    private final int x2;
    private final int y1;
    private final int y2;
    private final int m1;
    private final int m2;
    private final int n1;
    private final int n2;
    private final Double line1;
    private final Double line2;
    public lineComparisonProblem(int x1, int x2, int y1, int y2, int m1, int m2, int n1, int n2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.m1 = m1;
        this.m2 = m2;
        this.n1 = n1;
        this.n2 = n2;
        Double line1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        Double line2 = Math.sqrt((m2 - m1) * (m2 - m1) + (n2 - n1) * (n2 - n1));

        System.out.println("Line 1:"+line1);
        System.out.println("Line 2:"+line2);
        this.line1=line1;
        this.line2=line2;
    }
    public void equal(){
        if ( line1.equals(line2)) {
            System.out.println("Line1 is equal to Line2");
        }
        else{
            System.out.println("Line1 is not equal to Line2");
        }
    }
    public void compare(){
        int compareValue = line1.compareTo(line2);

        if(compareValue == 0){
            System.out.println("Both lines are equals");
        }else if (compareValue < 0){
            System.out.println("Line1 is less than Line2 :");
        }
        else {
            System.out.println("Line1 is greater than Line2");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for first Line X1,X2,Y1,Y1 :");
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println("Enter the value for second line M1,M2,N1,N2 :");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        lineComparisonProblem lcp = new lineComparisonProblem(x1,x2,y1,y2,m1,m2,n1,n2);
        lcp.equal();
        lcp.compare();



    }
}
