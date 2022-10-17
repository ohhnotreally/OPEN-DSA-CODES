import java.util.Scanner;

public class switchproject {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "Mango":
                System.out.println("King of the fruits");


            case "Apple":
                System.out.println("Eat one a day");
                break;
            case "Orange":
                System.out.println("Hello fruit");
                break;
            case "Grapes":
                System.out.println("Semi round nice fruit");
                break;
        }

    }
}
