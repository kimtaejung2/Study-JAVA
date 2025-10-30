import java.util.Scanner;

public class 학점출력if {
    public static void main(String[] args) {
        String grade;
        int score = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your score: ");
        score = input.nextInt();

        if(score >= 90)
            grade = "A";
        else if(score >= 80 && score < 90)
            grade = "B";
        else if(score >= 70 && score < 80)
            grade = "C";
        else  if(score < 70)
            grade = "D";
        else
            grade = "F";

        System.out.print("Your grade: " + grade);

//        switch문으로 변환
//
//        switch (score/10) {
//            case 9: grade = "A";
//            break;
//            case 8: grade = "B";
//            break;
//            case 7: grade = "C";
//            break;
//            default: grade = "F";
//        }
//        System.out.println("Your grade:  " + grade);
    }
}
