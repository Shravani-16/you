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

        // for (int i = 1; i < 4; i++) {
        // for (int a = 1; a < i + 1; a++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // subtractor
        System.out.println(substractBinaryNumber(10, 11));

    }

    static Integer addBinaryNumber(Integer firstNum, Integer secondNum) {
        StringBuilder output = new StringBuilder();
        int carry = 0;
        int temp;
        while (firstNum != 0 || secondNum != 0) {
            temp = (firstNum % 10 + secondNum % 10 + carry) % 2;
            output.append(temp);

            carry = (firstNum % 10 + secondNum % 10 + carry) / 2;
            firstNum = firstNum / 10;
            secondNum = secondNum / 10;
        }
        if (carry != 0) {
            output.append(carry);
        }
        return Integer.valueOf(output.reverse().toString());
    }

    static Integer getOnesComplement(Integer secondnum) {
        StringBuilder onesComplement = new StringBuilder();
        while (secondnum > 0) {
            int lastDigit = secondnum % 10;
            if (lastDigit == 0) {
                onesComplement.append(1);
            } else {
                onesComplement.append(0);
            }
            secondnum = secondnum / 10;
        }
        return Integer.valueOf(onesComplement.reverse().toString());
    }

    static Integer substractBinaryNumber(Integer firstNum, Integer secondNum) {
        int onesComplement = Integer.valueOf(getOnesComplement(secondNum));
        StringBuilder output = new StringBuilder();
        int carry = 0;
        int temp;
        while (firstNum != 0 || onesComplement != 0) {
            temp = (firstNum % 10 + onesComplement % 10 + carry) % 2;
            output.append(temp);
            carry = (firstNum % 10 + onesComplement % 10 + carry) / 2;

            firstNum = firstNum / 10;
            onesComplement = onesComplement / 10;
        }
        String additionOfFirstNumAndOnesComplement = output.reverse().toString();
        if (carry == 1) {
            return addBinaryNumber(Integer.valueOf(additionOfFirstNumAndOnesComplement), carry);
        } else {
            return getOnesComplement(Integer.valueOf(additionOfFirstNumAndOnesComplement));
        }
    }
}