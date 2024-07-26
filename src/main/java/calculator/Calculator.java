package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator  {

    private List<Integer> list = new ArrayList<Integer>(10);//동적 초기화
    int result;
    public List<Integer> getList(){
        return list;
    }
    public void setList(List<Integer> list){
        this.list = list;
    }
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
        System.out.println("결과: " + result);
        list.add(result);
    }
    public int divide(int num1, int num2) throws DivideException {
        if(num2 == 0){
            throw new DivideException();
        }
        return num1/num2;
    }
}
