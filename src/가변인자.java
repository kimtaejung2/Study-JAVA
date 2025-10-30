class C {
    double averageScore(int... a){ //가변 인자, 배열 형태
        int avg = 0;
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        avg = sum/a.length;

        return avg;
    }
}

public class 가변인자 {
    public static void main(String[] args) {
        C c = new C();
        double avg = c.averageScore(1,2,3);
        System.out.println(avg);
    }
}
