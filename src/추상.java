abstract class L {
    abstract void a();
    abstract void b();
}

class N extends L {
    void a() {
        System.out.println("Justify");
    }
    void b(){
        System.out.println("Justify");
    }
}

abstract class M{
    abstract void c();
}

public class 추상 extends N {
    public static void main(String[] args) {
        추상 obj = new 추상();
        M obj2 = new M(){
            void c(){
                System.out.println("Justify");
            }
        };

        obj.a();
        obj.b();
        obj2.c();
    }
}