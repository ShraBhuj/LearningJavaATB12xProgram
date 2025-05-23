package Tasks;

public class task_02_Ternary_Op {

    public static void main(String[] args) {
        int num1=50;
        int num2=49;
        int num3=59;
        int max=num1>num2?(num1>num3?num1:num3):(num2>num3?num2:num3);
        System.out.println("The Maximum number is = " + max);

    }
}
