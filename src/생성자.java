class D { //생성자 오버로딩
    D(){
        System.out.println("basic");
    }
    D(int a){
        this(); //클래스 내의 다른생성자를 호출하는 함수.
        System.out.println("Integer");
    }
    D(String a){
        System.out.println("String");
    }
}

public class 생성자 {
    public static void main(String[] args) {
        D d2 = new D(3);
        D d3 = new D("halroro");
    }
}
