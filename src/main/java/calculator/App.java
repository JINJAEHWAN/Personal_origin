package calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* 연산의 결과를 저장할 수 있도록 적합한 타입의 배열을 생성합니다. */
        /* 연산의 결과가 저장된 배열의 마지막 index를 저장하는 변수를 선언 */
        int[] aint = new int[10];
        int index=0;
        boolean istrue= true;
        Calculator calculator = new Calculator();
        while(istrue){
            System.out.print("첫 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int a = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의  변수에 저장합니다.
            int b = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: (+,-,*,/)");
            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
            char c = sc.next().charAt(0);
            int result = 0;
            /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
            calculator.calculate(a,b,c);

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            /* 위 요구사항에 맞게 구현 */
            String rm = sc.next();
            if (rm.equals("remove")) {
                calculator.getList().remove(0);
            }
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            /* 위 요구사항에 맞게 구현 */
            String inquiry = sc.next();
            if(inquiry.equals("inquiry")){
                for (int element: calculator.getList()){
                    System.out.println(element);
                }
            }
            System.out.println("더 계산하시겠습니까? (아무것이나 입력,exit 입력 시 종료)");
            String end = sc.next();

            if (end.equals("exit")) {
                break;
            }
            System.out.println("계속 합니다.");

        }
    }

}
