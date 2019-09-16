package br.com.philippesis.junit5androidtest.auxiliarclasses;

public class Calculator {

    private int mNum1;
    private int mNum2;

    public Calculator(int num1, int num2) {
        this.mNum1 = num1;
        this.mNum2 = num2;
    }

    public int add() { return mNum1 + mNum2; }
    public int subtract() { return mNum1 - mNum2; }
    public  int multiply() { return mNum1 * mNum2; }
    public int divide() { return mNum1 / mNum2; }

}
