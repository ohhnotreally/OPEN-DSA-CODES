import java.sql.SQLOutput;
import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = a;

        // Find the largest of the three numbers

        if ( b > max ){
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println(max);


        }
    }

