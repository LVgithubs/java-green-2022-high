package ex21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // .InputMismatchException

        // 통신, 사용자 입력은 예외처리!
        boolean check = true;

        try {

            int x = sc.nextInt();
            int result = x / 0;
            System.out.println("받은 값 : " + x);

            // 애초 문자열을 넣지 않도록 한다.
            // 유효성 검사
        } catch (InputMismatchException e) {
            // TODO: handle exception
            System.out.println("=============");
            System.out.println("문자를 넣지 마세요");
            System.out.println("=============");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("=============");
            System.out.println("0을 나누지 말 것");
            System.out.println("=============");
            e.printStackTrace();
        }

    }

}
