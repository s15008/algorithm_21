import static java.lang.System.out;

public class TestRandom {
    public static void main(String... args) {
        final int SEED = 3333;
        final int LOOP = 100;

        out.println("シード値" + SEED);
        out.println("(1)線形合同法");
        Random2 rand2 = new Random2(SEED);
        for (int i = 0; i < LOOP; i++) {
            out.print(rand2.rand2() + " ");
        }

        out.printf("\n\n(2)平方採中法\n");
        Random3 rand3 = new Random3(3333);
        for (int i = 0; i < LOOP; i++) {
            out.print(rand3.rand3() + " ");
        }
    }
}

/*
 * 線形合同法
 */
class Random2 {
    private int random;

    Random2(int seed) {
        srand2(seed);
    }

    private void srand2(int seed) {
        this.random = seed;
    }

    public int rand2() {
        this.random = (5 * this.random + 7) % 8;
        return this.random;
    }
}

/*
 * 平方採中法
 */
class Random3 {
    private int random;

    Random3(int seed) {
        srand3(seed);
    }

    private void srand3(int seed) {
        this.random = seed;
    }

    public int rand3() {
        int r;
        r = random * random;
        r /= 100;
        r %= 10000;
        random = r;

        return random;
    }
}
