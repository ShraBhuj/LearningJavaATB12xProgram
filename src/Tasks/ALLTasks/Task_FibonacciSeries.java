package Tasks.ALLTasks;

public class Task_FibonacciSeries {
    public static void main(String[] args) {
        int n1 = 1, n2 = 2;
        int series=10;
        System.out.print(n1+" "+n2+ " ");
        for(int i=3;i<=series;i++){
            int n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;

        }


    }
}
