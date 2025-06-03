package Tasks;

public class Task3_Max_in_3_Numbers {

    public static void main(String[] args) {
        int num1=50;
        int num2=49;
        int num3=59;
        int max=num1>num2?(num1>num3?num1:num3):(num2>num3?num2:num3);
        System.out.println("The Maximum number is = " + max);

    }
}
