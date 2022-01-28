package ex21;

import java.util.Scanner;

public class DivideByZero2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // .InputMismatchException

        // 통신, 사용자 입력은 예외처리!
        boolean check = true;
        int x;
        while (check) {
            try {

                x = sc.nextInt();
                // int result = x / 0;
                System.out.println("받은 값 : " + x);
                check = false;

                // 애초 문자열을 넣지 않도록 한다.
                // 유효성 검사
            } catch (Exception e) {
                // TODO: handle exception
                sc = new Scanner(System.in);
                System.out.println("=============");
                System.out.println("숫자를 넣어주세요");

                System.out.println(e.getMessage());
                System.out.println("=============");

                // e.printStackTrace();

            }
        }
    }

}
