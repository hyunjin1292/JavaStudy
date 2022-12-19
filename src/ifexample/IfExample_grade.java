package ifexample;
/* 성적에 따라 학점 부여하기
* 100 ~ 90 A, 89 ~ 80 B, 79 ~ 70 C, 69 ~ 60 D, 나머지 F
* int형 변수 score, char형 변수 grade를 사용하여 score에 따른 grade 출력하기
*/
public class IfExample_grade {
    public static void main(String[] args) {
        int score = 95;
        char grade;

        if(score >= 90) {
            grade = 'A';
        } else if(score >= 80) {
            grade = 'B';
        } else if(score >= 70) {
            grade = 'C';
        } else if(score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("성적 : " + score);
        System.out.println("학점은 " + grade + " 입니다.");
    }
}
