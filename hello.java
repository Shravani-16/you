class Simple {
    static String name = "John";

    static int and(int a, int b) {
        return a * b;
    }

    static int or(int a, int b) {
        return (a + b == 0) ? 0 : 1;
    }

    static int exor(int a, int b) {
        return (a == b) ? 0 : 1;
    }

    static int[] halfadder(int a, int b) {
        int carry = and(a, b);
        int sum = exor(a, b);
        int[] arr = { carry, sum };
        return arr;
    }

    static boolean evenodd(int i) {
        if (i % 2 == 0) {
            return true;
        } else
            return false;
    }

    public static void main(String args[]) {

        for (int i = 1; i < 4; i++) {
            for (int a = 1; a < i + 1; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // i = 1
        // a = 1
        // print 1
        // a++ a=2
        // a print 2
        // a++ 3
        // a print 3
        // a++ 4!<4 out of loop
        // i++
        // i=2

        // inner loop(same process {
        // a = 1
        // print 1
        // a++ a=2
        // a print 2
        // a++ 3
        // a print 3
        // a++ 4!<4 out of loop
        // })
        // i++
        // i=3
        // same wjbjh
        // i++
        // i= 4
        // i!< 4
        // out of outer loop

    }
}