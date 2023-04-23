package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {

        String str = "XYZ";

        permutations(str);

    }

    public static void permutations(String str) {
        List<String> ans = new ArrayList<>();
        ans.add(String.valueOf(str.charAt(0)));

        for (int i = 1; i < str.length(); i++) {
            for (int j = ans.size() - 1; j >= 0; j--) {
                String temp = ans.remove(j);

                for (int k = 0; k <= temp.length(); k++) {
                    ans.add(temp.substring(0, k) + str.charAt(i) + temp.substring(k));
                }
            }
        }

        System.out.println(ans);
    }
}
