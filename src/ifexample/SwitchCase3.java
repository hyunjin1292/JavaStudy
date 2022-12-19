package ifexample;
/*
* 1층 약국, 2층 정형외과, 3층 피부과, 4층 치과, 5층 헬스 클럽
*/
public class SwitchCase3 {
    public static void main(String[] args) {
        int floor = 5;
        String biz;

        switch(floor) {
            case 1:
                biz = "약국";
                break;
            case 2:
                biz = "정형외과";
                break;
            case 3:
                biz = "피부과";
                break;
            case 4:
                biz = "치과";
                break;
            default:
                biz = "헬스클럽";
                break;
        }
        System.out.println(floor + "층 " + biz + "입니다.");
    }
}
