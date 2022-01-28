package site.metacoding.ex23;

import javax.swing.plaf.basic.BasicTreeUI.TreeHomeAction;

class NewWorker implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 1; i < 7; i++) {
            System.out.println("뉴워커스레드 : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    // Runnable 타입에는 추상메서드가 존재하기 때문에
}

interface Hello {

}

public class ThreadEx02 {
    public static void main(String[] args) {

        // Main Thread 의 타겟은 main 메서드

        // NewWorker 생성
        Thread newWorker = new Thread(new NewWorker());
        // Thread 에 Runable 타입을 넣을 수 있는데 , 즉 슨 Interface 를 넣을 수 있다!
        // 하지만 Interface는 메인 메서드에서 new 를 할 수 없다.
        // 그렇기 때문에 Interface를 메인에 띄울 수 없다.

        newWorker.start(); // run() 메소드 호출
        // 왜 굳이 run 메소드를 타겟으로 잡아서 강제로 실행했을까?
        // 왜 run이 아니면 타겟으로 잡지 않을까?

        for (int i = 1; i < 7; i++) {
            System.out.println("메인스레드 : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

}
