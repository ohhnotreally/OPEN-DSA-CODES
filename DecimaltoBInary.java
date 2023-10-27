package recursion_subset;

public class DecimaltoBInary {
    public static void main(String[] args) {
        String binary = findBinary(321,"");
        System.out.println(binary);
    }

    static String findBinary(int decimal, String result) {
        if(decimal == 0) {
            return result;
        }

        result =  decimal % 2 + result;
        return findBinary(decimal/2, result);
    }
}
