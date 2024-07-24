package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
        switch (c) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
        }
        System.out.println("결과: " + result);
        System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");

    }

}
