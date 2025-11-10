interface R{
    abstract void r();
}

class R1 implements R{
    void abc(){
        System.out.println("ABC");
    }
    public void r(){
        System.out.println("r");
    }
}

public class 익명이너클래스 {
    public static void main(String[] args) {
        R1 r = new R1(){
            public void r(){
                System.out.println("R");
            }
            public void abc(){
                System.out.println("abc");
            }
        };

        r.abc();  // abc 메서드는 R1에서 정의되어 오버라이딩 됐기 때문에 R 객체로는 접근 불가.
        r.r();
    }
}
