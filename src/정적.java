class F{
    private int a = 1;
    private static int b = 0;

    static void cde(){
        F d = new F();
        System.out.println(d.a);
        System.out.println(b);  // static 메서드에는 정적 필드 or 객체를 통한 인스턴스 필드가 들어올 수 있음
    }
    void def(){
        System.out.println(a);
    }
}

public class 정적 {
    public static void main(String[] args) {
        F f = new F();
        F.cde();  // static 제어자를 사용하면 객체를 통해 접근하지 않아도 됨.
        f.def();
    }
}

