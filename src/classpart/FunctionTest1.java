package classpart;

public class FunctionTest1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int sum = add(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + sum + " 입니다.");

        int subtraction = minus(num1, num2);
        System.out.println(num1 + " - " + num2 + " = " + subtraction + " 입니다.");

        int multiplication = multiply(num1, num2);
        System.out.println(num1 + " * " + num2 + " = " + multiplication + " 입니다.");

        if(num2 == 0) {
            System.out.println("0은 나눌 수 없습니다.");
        } else {
            double division = divide(num1, num2);
            System.out.println(num1 + " / " + num2 + " = " + division + " 입니다.");
        }
    }

    public static int add(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }

    public static int minus(int n1, int n2) {
        int result = n1 - n2;
        return result;
    }

    public static int multiply(int n1, int n2) {
        int result = n1 * n2;
        return result;
    }

    public static int divide(int n1, int n2) {
        int result = n1 / n2;
        return result;
    }
}
