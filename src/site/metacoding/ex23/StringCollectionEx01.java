package site.metacoding.ex23;

public class StringCollectionEx01 {
    public static void main(String[] args) {
        // 긴 문자를 차곡차곡 저장해야할때 StringBuffer가 좋다
        // 차곡차곡 넣을때 무엇이 좋을까?
        // 보기에 좋고
        // 수정하기에도 편하다.

        // StringBuffer 자원 동기화 적용되어 있음!
        StringBuffer sb = new StringBuffer();
        sb.append("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst?");
        sb.append(
                "serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3%3D&");
        sb.append("numOfRows=10&");
        sb.append("pageNo=1&");
        sb.append("dataType=JSON&");
        sb.append("base_date=20220126&");
        sb.append("base_time=1700&");
        sb.append("nx=97&");
        sb.append("ny=75");

        System.out.println(sb.toString());

        // StringBuffer 와 StringBuilder 차이점!
        // 1> 가독성! ( String 과 StringBuffer와의 차이! )
        // 2> 하나의 자원을 동시에 요청하는 일이 생길 수도 있다. 그때 동기화를 요청해야할 수도 있다.
        // 그때는 StringBuilder 는 한 사람만 쓸 수 있기 때문에!
    }

}
