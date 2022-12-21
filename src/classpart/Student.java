package classpart;

public class Student {
    int studentID;
    String studentName;
    int grade;
    String address;

    // 메서드 추가
    public void showStudentInfo() {
        System.out.println(studentName + ", " + address);
    }

    //학생 이름을 반환하는 메서드
    public String getStudentName() {
        return studentName;
    }

    //학생 이름을 부여하는 메서드
    public void setStudentName(String name) {
        studentName = name;
    }

    //main함수 추가
    public static void main(String[] args) {
        Student studentAhn = new Student(); // Student 클래스 생성
        studentAhn.studentName = "안연수";
        System.out.println(studentAhn.studentName);
        System.out.println(studentAhn.getStudentName());
    }
}

