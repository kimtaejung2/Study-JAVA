class B {
    int arraySum(int [] a){
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
}

public class 배열객체 {
    public static void main(String[] args) {
       B b = new B();
       int [] data1 = new int[]{1, 2, 3};
       System.out.println(b.arraySum(new int[]{1, 2, 3})); //무명배열 사용법: new int[]{id1, id2, ...}
       System.out.println(b.arraySum(data1));
    }
}
