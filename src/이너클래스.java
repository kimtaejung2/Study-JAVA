class Outer{
    int a = 3;
    protected int b = 3;
    private int c = 3;
    static int d = 3;

    class Inner{  // 이너 클래스는 단독으로 쓰일 수 없음 (static이 없음, 인스턴스 멤버)
        void abc(){
            System.out.println(a + b + "abc" + c + d);  // 이너 클래스에선 아우터 클래스의 모든 멤버에 접근 가능.
        }
    }

    static class Inner2{
        void bcd(){
            System.out.println("bcd" + d);  // 정적 클래스, 메서드 안에는 정적 필드만 가능.
        }
    }

    class Inner3{
        int inA = 3;
        void cdef(){
            int inB = 3;
        }
        void def(){
            class InIner{}
            InIner in = new InIner();
            inA = 4;
        }
    }
}

public class 이너클래스{
    public static void main(String[]args){
        Outer.Inner obj1 = new Outer().new Inner();  // 이너 클래스 객체 생성 방법.
        Outer o = new Outer();
        Outer.Inner obj2 = o.new Inner();

        Outer.Inner2 obj3 = new Outer.Inner2();

        obj1.abc();
        obj2.abc();
        obj3.bcd();
    }
}
