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
    AddOperator addOperator = new AddOperator();
    SubtractOperator subtractOperator = new SubtractOperator();
    MultiplyOperator multiplyOperator = new MultiplyOperator();
    DivideOperator divideOperator = new DivideOperator();
    ModOperator modOperator = new ModOperator();
    /* 원의 넓이 저장 필드 Getter, Setter, 조회 메서드 구현 */


}
