class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNum();
        FirTest firTest = new FirTest();



        //Should be 10
        System.out.println(firTest.test(firNum, 10));

        //Should be 6
        System.out.println(new FirNumSum().calc(3));

        //Should be 24
        System.out.println(new FirNumFactorial().calc(4));

        //Should be 1
        System.out.println(new FirNumFactorial().calc(0));

        //Should be 3
        System.out.println(new FirNumMultiplyOdd().calc(4));

        //Should be 15
        System.out.println(new FirNumMultiplyOdd().calc(5));
    }
}

class FirNum {
    public int calc(int n) {
        return n;
    }
}

class FirNumSum extends FirNum {

    @Override
    public int calc(int n) {
        int numSum = 0;
        for (int i = 0; i <= n; i++) {
            numSum += i;
        }
        return numSum;
    }
}

class FirNumFactorial extends FirNum {

    @Override
    public int calc(int n) {
        int numFactorial = 1;
        for (int i = 1; i <= n; i++) {
            numFactorial *= i;
        }
        return numFactorial;
    }
}

class FirNumMultiplyOdd extends FirNum {

    @Override
    public int calc(int n) {
        int numMultOdd = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                continue;
            }
            numMultOdd *= i;
        }
        return numMultOdd;
    }
}