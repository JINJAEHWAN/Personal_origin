package calculator;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator extends Calculator{

    public List<Integer> listCal2 = new ArrayList<Integer>(10);
    public final void calculate(int num1, int num2, char operator){
        //오버라이딩 금지를 위해 final
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                try{
                    result = divide(num1, num2);
                }catch (DivideException e){
                    System.out.println(e.getMessage());
                }
                break;
        }
        System.out.println("결과: " + result);
        listCal2.add(result);
        setList(listCal2);
    }

}
