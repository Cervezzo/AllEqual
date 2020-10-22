import static java.lang.Integer.parseInt;

public class AllEqual {
    public static void main (String[] args) {



        int num1 = parseInt(args[0]);
        int num2 = parseInt(args[1]);
        int num3 = parseInt(args[2]);


        if (num1 == 10 && num2 == 10 && num3 == 10) {
            System.out.println("All equal");
        } else {
            System.out.println("Not equal");
        }


        }


    }
