public class 문자열비교 {
    public static void main(String[] args){
        String a= "null";
        String b= "null";
        String c = new String("null");
        String d = c;
        d = "Null";
        System.out.println(c == d); //문자열은 불변이기 때문에 다른 값을 대입하면 참조값이 변함/반면 배열은 가변.
        int e = System.identityHashCode(c);
        System.out.println(e);
    }
}