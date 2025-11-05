class I{
    I(){}
    I(int a){
        System.out.println("I");
    }
}

class J extends I{
    J(){}
    J(int a){
        super(a);
        System.out.println("J");
    }
}

public class 생성자상속 extends J {
    public static void main(String[] args) {
        J j = new J(3);
    }
}
