package calculator;

import java.util.ArrayList;
import java.util.List;

public class CircleCalculator extends Calculator{

    public List<Integer> listCircle2 = new ArrayList<Integer>();

    /* 원의 넓이를 구하는 메서드 선언*/
    public final void calculateCircleArea(int raduis) {
        //오버라이딩 금지를 위해 final
        /* 원의 넓이 계산 구현 */
        result=raduis*raduis;
        //System.out.println("결과: " + result);
        //set을  해줘야 함.
        listCircle2.add(result);
        setListCircle(listCircle2);
    }

}
