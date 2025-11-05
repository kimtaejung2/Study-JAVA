interface O {  // 다중 상속 가능 -> 객체 지향적인 요소다.
    static int a = 3;
    void abc();
    public default void def() {  // 디폴트 메서드를 사용하면 새롭게 추가된 메서드를 구현하지 않아도 에러가 발생하지 않음.
        System.out.println("def");
    }
}

interface P  {
    int a = 3;
    void abc();
}

class Q {
    boolean extend(){
        return true;
    }
}

public class 인터페이스 extends Q implements O,P {  // 인터페이스와 클래스 상속이 동시에 가능하지만 순서는 무조건 extends가 먼저.
    public void abc(){  // 인터페이스 안의 메서드는 모두 public abstract가 붙어있음.
        O.super.def();  // 정적 메서드에서는 호출이 불가능 함.
        System.out.println("abc");
    }

    public static void main(String[] args) {
//      a = 3;  인터페이스 안의 필드값은 모두 final이 붙어있음
        인터페이스 obj = new 인터페이스();
        System.out.println(obj.extend());
        obj.abc();
    }
}
