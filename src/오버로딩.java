class A{
    void method(){
        System.out.print("A클래스의 메서드");
    }
    void method(int a){
        System.out.println(a);
    }
    void method(double a){
        System.out.println(a);
    }
    void method(String a){
        System.out.println(a);
    }
}

public class 오버로딩 {
    public static void main(String[] args){
        A a = new A();
        a.method();
        a.method(3);
        a.method(2.6);
        a.method("helroro");
    }
}
