import static java.lang.System.out;

public class BMSearch {
    static String s1 = "I like Nikkei-software";
    static String s2 = "like";

    public static void main(String... args) {
        int index = bmSearch(s1, s2);
        if (index != -1) {
            out.println(index + 1);
        }
        else {
            out.println("ヒットなし");
        }
    }

    // 文字列s1から文字列s2の開始位置を検索する
    // ヒットしたら開始位置を返す
    // ヒットしなかったら-1を返す
    static int bmSearch(String s1, String s2) {
        int len2 = s2.length();
        int i = 0;
        while (i < s1.length() - len2) {
            if (s2.equals(s1.substring(i, i + len2))) {
                return i;
            }
            else {
                int inc = len2;
                for (int j = 0; j < len2; j++) {
                    if (s1.charAt(i + len2 - 1) == s2.charAt(j)) {
                        inc = j + 1;
                    }
                }
                i += inc;
            }
        }
        return -1;
    }
}

