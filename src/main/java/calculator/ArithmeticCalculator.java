package calculator;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator extends Calculator{

    public List<Integer> listCal2 = new ArrayList<Integer>(10);
    public final void calculate(int num1, int num2, char operator){
        //오버라이딩 금지를 위해 final
        switch (operator) {
            case '+':
                listCal2.add(addOperator.operate(num1, num2));
                break;
            case '-':
                listCal2.add(subtractOperator.operate(num1, num2));
                break;
            case '*':
                listCal2.add(multiplyOperator.operate(num1, num2));
                break;
            case '/':
                listCal2.add(divideOperator.operate(num1, num2));
                break;
            case '%':
                listCal2.add(modOperator.operate(num1, num2));
                break;
        }
        setList(listCal2);
    }

}
