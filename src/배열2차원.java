import java.util.Arrays;

public class 배열2차원 {
    public static void main(String[] args) {
        String a[][] = {{"Apple", "Banana", "Kiwi"},
                        {"Orange", "Grape"}
        };

        for(int i =0; i < a.length; i++){
            for(String key : a[i]){
                System.out.println(key);
            }
        }
    }
}
