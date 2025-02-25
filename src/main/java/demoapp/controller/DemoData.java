package demoapp.controller;

import javax.validation.constraints.Size;

public class DemoData {


    private String palindrome;
    private int evenNum;
    private double sqrt;
    private double sqrtChk;
    private String calculator;

    public String getPalindrome() {
        return palindrome;
    }

    public void setPalindrome(String palindrome) {
        this.palindrome = palindrome;
    }

    public int getEvenNum() {
        return evenNum;
    }

    public void setEvenNum(int evenNum) {
        this.evenNum = evenNum;
    }

    public double getSqrt() {
        return sqrt;
    }

    public void setSqrt(double sqrt) {
        this.sqrt = sqrt;
    }

    public double getSqrtChk() {
        return sqrtChk;
    }

    public void setSqrtChk(double sqrtChk) {
        this.sqrtChk = sqrtChk;
    }

    public String getCalculator() {
        return calculator;
    }

    public void setCalculator(String calculator) {
        this.calculator = calculator;
    }
}
