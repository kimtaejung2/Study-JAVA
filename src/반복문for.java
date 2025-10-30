public class 반복문for {
    public static void main(String[] args) {
        for (int i = 0; ;i++) {
            if(i%2!=0 && i<=10) {
                continue;
            } else if(i >10) {
                break;
            }
            System.out.println(i);
        }
        
//        break continue없는 버전
//        
//        for(int i = 0; i<10;i++ ) {
//            if(i%2==0) {
//                System.out.println(i);
//            }
//        }
    }
}
