package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator  {

    List<Integer> list = new ArrayList<Integer>(10);
    int result;
    public void calculate(int num1, int num2, char operator){
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
        list.add(result);
    }
    public int divide(int num1, int num2) throws DivideException {
        if(num2 == 0){
            throw new DivideException();
        }
        return num1/num2;
    }
}
