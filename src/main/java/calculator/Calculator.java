package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator  {
    static int result = 0; //언제나 호출 가능하도록.
    //final은 상속 불가능.  오버라이딩 금지를 위해
    private List<Integer> listCal = new ArrayList<Integer>(10);//동적 초기화
    private List<Integer> listCircle = new ArrayList<Integer>(10);

    public List<Integer> getList(){
        return listCal;
    }
    public void setList(List<Integer> list){
        this.listCal = list;
    }
    public List<Integer> getListCircle(){
        return listCircle;
    }
    public void setListCircle(List<Integer> list){
        this.listCircle = list;
    }

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
        listCal.add(result);
    }

    /* 원의 넓이를 구하는 메서드 선언*/
    public final void calculateCircleArea(int raduis) {
        //오버라이딩 금지를 위해 final
        /* 원의 넓이 계산 구현 */
        result=raduis*raduis;
        //System.out.println("결과: " + result);
        listCircle.add(result);
    }
    /* 원의 넓이 저장 필드 Getter, Setter, 조회 메서드 구현 */

    public static int divide(int num1, int num2) throws DivideException {
        if(num2 == 0){
            throw new DivideException();
        }
        return num1/num2;
        //언제나 호출할 수 있게 하기.
    }
}
