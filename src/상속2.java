class K{
    K(){}
    int data;
    K(int data){
        this.data=data;
    }

    boolean equals(K obj){
        return this.data == obj.data;
    }

}

public class 상속2 extends K {
    public static void main(String[] args) {
        K obj1 = new K(0b11);
        K obj2 = new K(0b11);

        System.out.println(obj1.equals(obj2));  // equals 메서드에 인수로 객체를 보내면 주소값을 비교하기 때문에
                                                // data 값을 비교 하기 위해선 equals 함수를 오버라이딩 해야 함.
    }
}
