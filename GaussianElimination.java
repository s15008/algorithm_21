
public class GaussianElimination {
    static final double inputs[][] = {
        {2, 3, -4, -4},
        {3, -5, 3, 2},
        {-4, 9, -2, 8},
    };

    public static void main(String... args) {
        gauss(inputs);
        System.out.printf("x = %.2f\n", inputs[0][inputs.length]);
        System.out.printf("y = %.2f\n", inputs[1][inputs.length]);
        System.out.printf("z = %.2f\n", inputs[2][inputs.length]);
    }

    static void gauss(double[][] inputs) {
        int i, j, k;

        // 前進消去
        double d;
        for (i = 0; i < inputs.length; i++) {
            // 係数を1にする
            d = inputs[i][i];
            for (j = 0; j < inputs.length + 1; j++) {
                inputs[i][j] /= d;
            }
            // 項を消去する
            double e;
            for (k = i + 1; k < inputs.length; k++) {
                e = inputs[k][i];
                for (j = 0; j < inputs.length + 1; j++) {
                    inputs[k][j] -= inputs[i][j] * e;
                }
            }
        }

        // 後退代入
        for (j = inputs.length - 1; j > 0; j--) {
            for (i = j - 1; i >= 0; i--) {
                inputs[i][inputs.length] -= inputs[i][j] * inputs[j][inputs.length];
            }
        }
    }
}

