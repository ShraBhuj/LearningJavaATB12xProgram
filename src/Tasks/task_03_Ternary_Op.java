package Tasks;

public class task_03_Ternary_Op {
    public static void main(String[] args) {
        int Your_Age=10;
        String Verifying=Your_Age>=18?((Your_Age>=18&&Your_Age<=65)?"You are Adult":"You are Senior"):"you are Minor";
        System.out.println(Verifying); //
    }
}
