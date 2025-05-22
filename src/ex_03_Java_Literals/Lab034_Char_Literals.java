package ex_03_Java_Literals;

public class Lab034_Char_Literals {

    public static void main(String[] args) {

        char c1 = 'A'; // A to Z, a-z, !@#$%^&*()_+
//        char c = "A"; // "" == String = Bunch of Char

        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("PrafullMishra");
        System.out.println("Prafull"+new_line+"Mishra");
        System.out.println("Prafull\nMishra");
        System.out.println("Prafull"+tab_line+"Mishra");
        System.out.println("Prafull"+back_space+"Mishra");
        System.out.println( " ----- ");

        System.out.println("Prafull is "+carriage_return+"Mishra");

        System.out.println("Hi, This is a First line"+new_line+"This is second line\n This is Third line");


        char c10 = 'A';
        //  // ASCII, (limited numbers) - A -> 65

        char ruppes = '₹';
        System.out.println(ruppes);

        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);

        char c11  = '\u1F60';






    }
}
