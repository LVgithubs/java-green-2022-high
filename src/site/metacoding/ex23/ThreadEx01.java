package site.metacoding.ex23;

public class ThreadEx01 {
    public static void main(String[] args) {
        System.out.println(1);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) { // 행위중 방해가 들어왔을때 발생하는 예외처리
            // TODO Auto-generated catch block
            e.printStackTrace();
        } // 슬립의 단위는 mili seconds 1/1000 초
        System.out.println(2);
    }

}
