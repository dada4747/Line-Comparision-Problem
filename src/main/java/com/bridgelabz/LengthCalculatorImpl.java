package com.bridgelabz;

public class LengthCalculatorImpl implements LengthCalculator {
    @Override
    public Double calLenthOfLine(Line firstLineComp) {
        return Math.sqrt(
                (firstLineComp.getEndOfX() - firstLineComp.getStartOfX()) *
                (firstLineComp.getEndOfX() - firstLineComp.getStartOfX()) +
                (firstLineComp.getEndOfY() - firstLineComp.getStartOfY()) *
                (firstLineComp.getEndOfY() - firstLineComp.getStartOfY())
        );
    }
}
