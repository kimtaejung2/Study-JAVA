//public 모든 패키지 내에서 사용 가능.
//protected 다른 패키지에선 상속해야만 사용 가능.
//default 같은 패키지에서만 사용 가능
//private 같은 클래스에서만 사용 가능

//import는 단지 클래스를 연결해주는 역할, public만 import 가능

class E {
    String c;
    private int a = 0;
    E(String c) {
        this.c = c;
//      private int b = 3; 생성자 안에는 private 사용 불가
        this.__str__();
    }
    void __str__() {
        System.out.println(c);
    }
}


public class 접근지정자 {
    public static void main(String[] args){
        E e = new E("kimtaejung2");
//      System.out.print(e.a);  private이면 상속을 해서도 외부에서의 접근이기에 불가능
    }
}
