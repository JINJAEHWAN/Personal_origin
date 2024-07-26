package calculator;

public class DivideOperator {
    int answer=0;
    public int operate(int num1, int num2) {
        try{
            answer=num1/num2;
            if(num2 == 0){
                throw new DivideException();
            }
        }catch (DivideException e){
            System.out.println(e.getMessage());
        }
        System.out.println("결과는 "+ answer);
        return answer;
    }
}
