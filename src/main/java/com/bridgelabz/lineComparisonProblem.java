package com.bridgelabz;

import java.util.Scanner;
import java.lang.*;
public class lineComparisonProblem {
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

        Double line1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        Double line2 = Math.sqrt((m2 - m1) * (m2 - m1) + (n2 - n1) * (n2 - n1));

        System.out.println("Line 1:"+line1);
        System.out.println("Line 2:"+line2);

        int compareValue = line1.compareTo(line2);

        if(compareValue == 0){
            System.out.println("Both lines are equals");
        }else if (compareValue < 0){
            System.out.println("Line1 is less than line2 :");
        }
        else {
            System.out.println("Line1 is greater than line2");
        }

    }
}
