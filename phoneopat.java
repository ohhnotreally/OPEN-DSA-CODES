package recursion_subset;

import javax.print.DocFlavor;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class phoneopat {
    public static void main(String[] args) {
        pad("","12");
        System.out.println(padRet("", "12"));
    }

    static void pad(String p,String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - 0;
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char)('a'+ i);
            pad(p+ch,up.substring(1));
        }
    }

    static List<String> padRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();

        if (digit != 1 || digit != 7 || digit != 9) {
            for (int i = (digit - 1) * 3; i < digit * 3 ; i++) {
                char ch = (char)('a'+i);
                list.addAll(padRet(p+ch,up.substring(1)));
            }

        } else if ( digit == 7 || digit == 9) {
            for (int i = (digit - 1) * 4; i < digit * 4 ; i++) {
                char ch = (char)('a'+i);
                list.addAll(padRet(p+ch,up.substring(1)));
            }

        }
        else {
            return new ArrayList<>();
        }
        return list;
    }

}
