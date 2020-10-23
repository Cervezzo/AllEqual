import static java.lang.Integer.parseInt;

public class AllEqual {
    public static void main (String[] args) {



        int num1 = parseInt(args[0]);
        int num2 = parseInt(args[1]);
        int num3 = parseInt(args[2]);


        if (num1 == num2 && num2 == num3 && num3 == num1) {
            System.out.println("All equal");
        } else {
            System.out.println("Not equal");
        }


        }


    }
