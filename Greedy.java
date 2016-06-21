import static java.lang.System.out;

public class Greedy {
    // 硬化の種類
    static final int VAL[] = {500, 100, 50, 10, 5, 1};
    static final int NUM = 1999;

    public static void main(String... args) {
        out.println(NUM + "円のおつり");
        int ans[] = changeVal(NUM, VAL);
        for (int i = 0; i < ans.length; i++) {
            out.println(VAL[i] + " : " + ans[i] + "枚");
        }
        int sum = 0;
        for (int i : ans) {
            sum += i;
        }
        out.println("合計" + sum + "枚");
    }

    static int[] changeVal(int num, int[] pattern) {
        int cnt[] = new int[pattern.length];
        int n = num;
        for (int i = 0; i < pattern.length; i++) {
            cnt[i] = n / VAL[i];
            n %= VAL[i];
        }
        return cnt;
    }
}

