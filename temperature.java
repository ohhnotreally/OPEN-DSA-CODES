import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Temp in C:");
        float tempC = in.nextFloat();

        float tempf = (tempC * 9/5) + 32;

        System.out.print(tempf);

    }
}
