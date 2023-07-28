package Part_02_03_OOP_Core.ch14;

import Part_02_03_OOP_Core.ch14.Calc;

public abstract class Calculator implements Calc {

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }

//    public void description() {
//        System.out.println("더하기와 빼기 기능을 갖춘 계산기입니다.");
//    }
}
