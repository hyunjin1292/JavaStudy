package chapter2;

public class CharacterEx3 {
    public static void main(String[] args) {
        int a = 65;
        int b = -66;

        char a2 = 65;
        //char b2 = -66;  // 문자형에 변수 넣으면 오류발생으로 주석처리

        System.out.println((char)a);
        System.out.println((char)b);  // 알수없는 문자 출력
        System.out.println(a2);
    }
}
