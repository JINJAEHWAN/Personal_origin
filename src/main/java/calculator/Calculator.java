package calculator;

public class Calculator  {
    double result;
    public double calculate(int num1, int num2, char operator){
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
                    divide(num1, num2);
                }catch (DivideException e){
                    System.out.println(e.getMessage());
                }
                break;
        }
        return result;
    }
    public void divide(int num1, int num2) throws DivideException {
        if(num2 == 0){
            throw new DivideException();
        }
    }
}
