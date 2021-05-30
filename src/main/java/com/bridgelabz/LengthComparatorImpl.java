package com.bridgelabz;

import java.lang.*;

public class LengthComparatorImpl implements LengthComparator {
    LengthCalculator lengthCalculator = new LengthCalculatorImpl();
    @Override
    public void compareUsingEqual(Line firstLineComp, Line secondLineComp) {
        Double firstLine = lengthCalculator.calLenthOfLine(firstLineComp);
        Double secondLine = lengthCalculator.calLenthOfLine(secondLineComp);

        if ( firstLine.equals(secondLine)) {
            System.out.println("Line1 is equal to Line2");
        }
        else{
            System.out.println("Line1 is not equal to Line2");
        }
    }
    @Override
    public void compareUsingCompareTo(Line firstLineComp, Line secondLineComp) {
        Double firstLine = lengthCalculator.calLenthOfLine(firstLineComp);
        Double secondLine = lengthCalculator.calLenthOfLine(secondLineComp);

        int compareValue = firstLine.compareTo(secondLine);
        if(compareValue == 0){
            System.out.println("Both lines are equals");
        }else if (compareValue < 0){
            System.out.println("Line1 is less than Line2 :");
        }
        else {
            System.out.println("Line1 is greater than Line2");
        }
    }
}

