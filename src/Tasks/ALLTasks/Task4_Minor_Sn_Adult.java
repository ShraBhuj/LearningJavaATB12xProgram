package Tasks.ALLTasks;

public class Task4_Minor_Sn_Adult {
    public static void main(String[] args) {
        int Your_Age=10;
        String Verifying=Your_Age>=18?((Your_Age>=18&&Your_Age<=65)?"You are Adult":"You are Senior"):"you are Minor";
        System.out.println(Verifying); //
    }
}
