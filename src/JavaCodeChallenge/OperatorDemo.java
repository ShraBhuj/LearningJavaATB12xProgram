package JavaCodeChallenge;

public class OperatorDemo {
    public static void main(String[] args) {

        int a = 4;
        int b = 5;

        //Arithmetic Operator
        System.out.println("a=:" + a + ", b=" + b);
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (a / b): " + (a / b));
        System.out.println("Modulus (a % b): " + (a % b));

        // Assignment Operators

        System.out.println("-----------Assignment Operators------------");

        int c = b;  // c = 5
        System.out.println("Initial value of c: " + c);

        c += 5;
        System.out.println("After c += 5: " + c);

        c -= 2;
        System.out.println("After c -= 2: " + c);

        c *= 3;
        System.out.println("After c *= 3: " + c);

        c /= 3;
        System.out.println("After c /= 3: " + c);

        c %= 4;
        System.out.println("After c %= 4: " + c);
    }
}