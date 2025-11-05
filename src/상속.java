class G {
    int n = 2;
    static int m = 4;

    void a(){
        System.out.println("Parents");
    }
}

  // 필드는 오버라이딩이 없음. (정적 바인딩)

class H extends G {
    int n = 4;
    static int m = 6;

    void a() {
        System.out.println("DFDF");
    }
}

public class 상속 extends H {
    public static void main(String[] args) {
        G h = new 상속();  // 객체 변수 h는 G타입이지만 실행 시점에서 H객체를 보고 H클래스의 메서드를 씀 (동적 바인딩)
        h.a();
        System.out.println(h.n);  // 2, 컴파일 시점에서 G의 필드값은 오버라이딩이 안 되기 때문에 부모 필드 사용 (정적 바인딩)
    }
}
